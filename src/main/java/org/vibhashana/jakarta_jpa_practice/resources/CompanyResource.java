package org.vibhashana.jakarta_jpa_practice.resources;

import java.util.List;

import org.vibhashana.jakarta_jpa_practice.entities.Company;
import org.vibhashana.jakarta_jpa_practice.services.CompanyService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/companies")
public class CompanyResource {
	@Inject
	private CompanyService companyService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Company> findCompanies() {
		return companyService.findCompanies();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Company findCompany(@PathParam("id") String id) {
		return companyService.findCompany(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveCompany(Company company) {
		return Response.status(Response.Status.CREATED).entity(companyService.saveCompany(company)).build();
	}
}
