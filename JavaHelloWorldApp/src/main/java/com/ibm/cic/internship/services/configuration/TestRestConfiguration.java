package com.ibm.cic.internship.services.configuration;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.ibm.cic.internship.services.rest.DummyTestService;

public class TestRestConfiguration extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>();

		classes.add(DummyTestService.class);

		return classes;
	}
}
