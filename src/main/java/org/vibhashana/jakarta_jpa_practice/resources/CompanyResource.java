package org.vibhashana.jakarta_jpa_practice.resources;

import java.util.List;

import org.vibhashana.jakarta_jpa_practice.entities.Company;
import org.vibhashana.jakarta_jpa_practice.services.CompanyService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api/companies")
public class CompanyResource {
	private final CompanyService companyService;

	@Inject
	public CompanyResource(CompanyService companyService) {
		this.companyService = companyService;
	}

	@GET
	@Path("/")
	public List<Company> getCompanies() {
		return companyService.findCompanies();
	}
}
