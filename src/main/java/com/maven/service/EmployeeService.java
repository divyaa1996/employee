package com.maven.service;

import java.util.List;
import java.util.Optional;

import com.maven.dto.Employee;

public interface EmployeeService {

	Optional<Employee> getEmployeeById(Employee employee);

	Optional<Employee> addEmployee(Employee employee);

	List<Employee> getEmployees();

	Optional<Employee> updateemployee(Employee employee);

}
