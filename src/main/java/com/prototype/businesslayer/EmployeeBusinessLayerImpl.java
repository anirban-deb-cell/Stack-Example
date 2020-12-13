package com.prototype.businesslayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.prototype.model.Employee;
import com.prototype.repository.EmployeeRepository;

@Component
public class EmployeeBusinessLayerImpl implements IEmployeeBusinessLayer  {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeBusinessLayerImpl() {
	}

	@Override
	public void saveEmployeeDetails(Employee employee) {
		com.prototype.entity.Employee employeeEntity = new com.prototype.entity.Employee();
		employeeEntity.setFirstName(employee.getFirstName());
		employeeEntity.setLastName(employee.getLastName());
		employeeRepository.save(employeeEntity);
	}

	@Override
	public Employee getLastEmployee() {
		
		com.prototype.entity.Employee emp = employeeRepository.findAll(Sort.by(Direction.DESC,"id")).stream().findFirst().get();
		employeeRepository.deleteById(emp.getId());
		Employee employee = new Employee();
		employee.setFirstName(emp.getFirstName());
		employee.setLastName(emp.getLastName());
		
		return employee;
		
	}
}
