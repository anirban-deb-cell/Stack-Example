package com.prototype.controller;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prototype.businesslayer.IEmployeeBusinessLayer;
import com.prototype.model.Employee;

@Component
public class RestContollerImpl implements RestEndController {

	@Autowired
	IEmployeeBusinessLayer employeeBusinessLayerImpl;
	
	public RestContollerImpl() {
		super();
	}

	@Override
	public Response insertEmployeeName(Employee employee) {
		
		employeeBusinessLayerImpl.saveEmployeeDetails(employee);
		return Response.ok().build();
	}

	@Override
	public Response returnLastEmployee() {
		Employee employee = employeeBusinessLayerImpl.getLastEmployee();
		return Response.ok().entity(employee).build();
	}

}
