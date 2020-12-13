package com.prototype.controller;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.prototype.model.Employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@Path("/api")
public interface RestEndController {
	
	

	@POST
	@Path("/add-emp")
	@ApiOperation(value = "Inser new Employee Details",
	               notes="USe this API end point to save new Employee Object",
	               response=Response.class)
	public Response insertEmployeeName(Employee employee);
	
	@GET
	@Path("/retrieve-emp")
	@Produces("application/json")
	@ApiOperation(value = "Retrieve last inserted employee",
	               notes="Use this API to retrieve last inserted employee",
	               response=Response.class)
	public Response returnLastEmployee();
	
}
