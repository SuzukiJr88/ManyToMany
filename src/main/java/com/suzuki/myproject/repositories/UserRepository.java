package com.suzuki.myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suzuki.myproject.entities.User;

public interface UserRepository extends JpaRepository <User, Integer> {

}
