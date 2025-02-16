package org.vibhashana.jakarta_jpa_practice.resources;

import org.vibhashana.jakarta_jpa_practice.services.EmployeeService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/employees")
public class EmployeeResource {
	@Inject
	EmployeeService empService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findEmployees() {
		return Response.status(Response.Status.OK).entity(empService.findEmployees()).build();
	}
}