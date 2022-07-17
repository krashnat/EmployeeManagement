package com.greatlearning.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.employeemanagement.entity.User;

public interface UserService {
	public List<User> findAll();

	public Optional<User> findById(long theId);

	public void save(User theUser);

	public void deleteById(long theId);

	public Optional<User> findByUserName(String userName);
}