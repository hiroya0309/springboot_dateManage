package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DateManageService {
	
	@Autowired
	DateManageRepository repository;
	

	public List<DateManage> findAll() {
		return repository.findAll();
	}

	public DateManage findOne(Long id) {
		return repository.findById(id).orElse(null);
	}

	public DateManage save(DateManage date) {
		return repository.save(date);	
	}

	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	

}
