package com.example.EmployeeCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeCRUD.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	 
}
