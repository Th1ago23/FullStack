package com.javaproject.webtodo.repository;

import com.javaproject.webtodo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public  interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
