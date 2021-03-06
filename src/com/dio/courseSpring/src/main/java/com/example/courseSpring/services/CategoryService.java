package com.example.courseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courseSpring.entities.Category;
import com.example.courseSpring.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public boolean findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.isPresent();
	}
}
