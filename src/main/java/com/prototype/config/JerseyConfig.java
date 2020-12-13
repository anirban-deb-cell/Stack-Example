package com.prototype.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.prototype.businesslayer.EmployeeBusinessLayerImpl;
import com.prototype.controller.RestContollerImpl;

@Configuration
public class JerseyConfig extends ResourceConfig{

	JerseyConfig(){
		register(RestContollerImpl.class);
	}
}
