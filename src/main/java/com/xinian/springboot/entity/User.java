package com.xinian.springboot.entity;


import lombok.Data;

import javax.persistence.*;


/**
 * @author xinian
 * @date 2018/12/31 14:57
 */
@Data
@Table(name = "tb_user")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "last_name")
	private String lastName;
	@Column
	private String email;
	@Column
	private String phone;
}
