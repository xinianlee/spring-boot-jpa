package com.xinian.springboot.repository;


import com.xinian.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xinian
 * @date 2018/12/31 15:03
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
