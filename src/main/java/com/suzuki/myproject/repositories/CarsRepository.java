package com.suzuki.myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suzuki.myproject.entities.Car;

public interface CarsRepository extends JpaRepository<Car, Integer>{

}
