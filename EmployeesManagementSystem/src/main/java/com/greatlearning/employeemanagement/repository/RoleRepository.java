package com.greatlearning.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemanagement.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
