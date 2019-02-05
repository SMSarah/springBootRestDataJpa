package com.springboot.springrestdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springrestdatajpa.entity.Employee;
import com.springboot.springrestdatajpa.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeServices;

	public void setEmployeeServices(EmployeeService employeeServices) {
		this.employeeServices = employeeServices;
	}

	@GetMapping("/api/employees")
	public List<Employee> getEmployees() {
		return employeeServices.retrieveEmployees();
	}

	@GetMapping("/api/employees/{employeeId}")
	public Employee getEmployee(@PathVariable(name="employeeId")Long employeeId) {
		return employeeServices.getEmployee(employeeId);
	}

	@PostMapping("/api/employees")
	public void saveEmployee(Employee employee) {
		employeeServices.saveEmployee(employee);
	}

	@PutMapping("/api/employees/{employeeId}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable(name="employeeId")Long employeeId) {
		employeeServices.updateEmployee(employee);
	}

	@DeleteMapping("/api/employees/{employeeId}")
	public void deleteEmployee(@PathVariable(name="employeeId")Long employeeId) {
		employeeServices.deleteEmployee(employeeId);
	}
}
