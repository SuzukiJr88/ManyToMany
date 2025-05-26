package com.suzuki.myproject.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suzuki.myproject.entities.Car;
import com.suzuki.myproject.services.CarsService;

@RestController
@RequestMapping (value = "/cars")
public class CarsResource {

	@Autowired
	private CarsService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Car> findById(@PathVariable Integer id){
		Car obj  = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
