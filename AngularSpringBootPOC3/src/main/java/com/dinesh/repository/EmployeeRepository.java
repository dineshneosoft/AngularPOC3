package com.dinesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
