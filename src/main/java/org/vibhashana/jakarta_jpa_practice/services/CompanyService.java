package org.vibhashana.jakarta_jpa_practice.services;

import java.util.List;

import org.vibhashana.jakarta_jpa_practice.entities.Company;
import org.vibhashana.jakarta_jpa_practice.repos.CompanyRepo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.NoArgsConstructor;

@ApplicationScoped
@NoArgsConstructor
public class CompanyService {
	@Inject
	private CompanyRepo companyRepo;

	public List<Company> findCompanies() {
		return companyRepo.findCompanies();
	}
}
