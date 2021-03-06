package com.springboot.springrestdatajpa.service;

import java.util.List;

import com.springboot.springrestdatajpa.entity.Employee;

public interface EmployeeService {

	public List<Employee> retrieveEmployees();
	public Employee getEmployee(Long employeeId);
	public void saveEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Long employeeId);
}
