package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {
	
	@Autowired
	EmployeesRepository repository;
	
	public List<Employees> search(Long id, String dateid, String datename, String formula) {
		List<Employees> result = repository.findAll();
		return result;
	}
	

}
