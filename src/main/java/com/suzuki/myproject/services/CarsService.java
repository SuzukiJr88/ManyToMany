package com.suzuki.myproject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzuki.myproject.entities.Car;
import com.suzuki.myproject.repositories.CarsRepository;

@Service
public class CarsService {
	
	@Autowired
	CarsRepository repository;

	public Car findById(Integer id) {
		Optional<Car> obj = repository.findById(id);
		return obj.get();
	}
}
