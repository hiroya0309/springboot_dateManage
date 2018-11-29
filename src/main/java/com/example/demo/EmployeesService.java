package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {
	
	@Autowired
	EmployeesRepository repository;
	

	public List<Employees> findAll() {
		return repository.findAll();
	}

	public Employees findOne(Long id) {
		return repository.findById(id).orElse(null);
	}

	public Employees save(Employees date) {
		return repository.save(date);
		
	}

	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	

}
