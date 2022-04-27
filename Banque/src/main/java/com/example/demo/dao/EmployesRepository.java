package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employee;

public interface EmployesRepository extends JpaRepository <Employee, Long>{
	List<Employee> findAll();
}
