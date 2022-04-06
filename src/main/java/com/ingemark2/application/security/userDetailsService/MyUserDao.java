package com.ingemark2.application.security.userDetailsService;

import com.ingemark2.application.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserDao extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByUsername(String username);
}
