package com.LeonardoKoslowski.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LeonardoKoslowski.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
