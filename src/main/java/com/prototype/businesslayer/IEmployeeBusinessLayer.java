package com.prototype.businesslayer;

import com.prototype.model.Employee;

public interface IEmployeeBusinessLayer {

	public void saveEmployeeDetails(Employee employee);
	public Employee getLastEmployee();
}
