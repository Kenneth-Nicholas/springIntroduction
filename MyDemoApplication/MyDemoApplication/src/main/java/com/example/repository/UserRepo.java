package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

	@Query("Select U from User U where U.email = ?1 and U.password = ?2")
	User login(String email, String password);
	
}
