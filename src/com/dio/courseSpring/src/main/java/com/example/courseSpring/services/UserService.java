package com.example.courseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courseSpring.entities.User;
import com.example.courseSpring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public boolean findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.isPresent();
	}
}
