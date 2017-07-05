package com.ibm.cic.internship.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/DummyService")
public class DummyTestService {

	@GET
	@Path("getDummy")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDummy() {
		ResponseBuilder response = Response.ok(new Dummy("Mostafa", 33));
		return response.build();
	}

}

class Dummy {

	private String name;
	private int age;

	public Dummy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
