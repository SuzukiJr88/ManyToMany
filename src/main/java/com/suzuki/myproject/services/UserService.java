package com.suzuki.myproject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzuki.myproject.entities.User;
import com.suzuki.myproject.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
