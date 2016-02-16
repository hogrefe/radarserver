package com.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

@Path("/")
public class User {
	@GET
	@Path("/verifyUser")
	@Produces(MediaType.TEXT_PLAIN)
	public String verifyUser(@QueryParam("username") String username, @QueryParam("password") String password) {
		System.out.println(username+" "+password);
		
		// return user id or 'error'
		return "123";
	}
	
	@POST
	@Path("/registerUser")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String registerUser(MultivaluedMap<String,String> multivaluedMap) {
		System.out.println(multivaluedMap.get("image"));
 
		
		// return user id or 'error'
		return "error";
	}
 
}
