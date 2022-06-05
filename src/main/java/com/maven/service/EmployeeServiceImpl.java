package com.maven.service;

import java.util.List;
import java.util.Optional;

import com.maven.dao.EmployeeDAOImpl;
import com.maven.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	//Map<Integer,Employee> employeeDB = new HashMap();
		EmployeeDAOImpl employeeDAOImpl=new EmployeeDAOImpl();

		public Optional<Employee> addEmployee(Employee employee) {
			
			return employeeDAOImpl.addEmployee(employee);
		}

		

		public Optional<Employee> getEmployeeById1(Employee employee) {
			
			return employeeDAOImpl.getEmployeeById(employee);
		}

		
		public List<Employee> getEmployees() {
			// TODO Auto-generated method stub
			return employeeDAOImpl.getEmployees();
		}



		public Optional<Employee> updateemployee(Employee employee) {
			// TODO Auto-generated method stub
			return employeeDAOImpl.updateemployee(employee);
		}



		public Optional<Employee> getEmployeeById(Employee employee) {
			// TODO Auto-generated method stub
			return null;
		}

}
