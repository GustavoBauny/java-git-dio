package com.example.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courseSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
