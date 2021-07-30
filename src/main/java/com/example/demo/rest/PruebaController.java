package com.example.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("/coches")
@Produces(MediaType.APPLICATION_JSON)
public class PruebaController {
	
	@GET
	public Response hello() {
		String mensaje = "Hola desde CochesController!";
		return Response.ok().entity(mensaje).build();
	}

}

