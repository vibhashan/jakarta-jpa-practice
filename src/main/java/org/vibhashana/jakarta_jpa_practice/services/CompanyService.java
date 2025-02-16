package org.vibhashana.jakarta_jpa_practice.services;

import java.util.List;

import org.vibhashana.jakarta_jpa_practice.entities.Company;
import org.vibhashana.jakarta_jpa_practice.repos.CompanyRepo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class CompanyService {
	@Inject
	private CompanyRepo companyRepo;

	@Inject
	private EntityManager em;

	public List<Company> findCompanies() {
		return companyRepo.findCompanies();
	}

	public Company findCompany(String id) {
		return companyRepo.findCompany(id);
	}

//	@Transactional // Works for JTA persistence context
	public Company saveCompany(Company company) {
		return companyRepo.saveCompany(company);

	}
}
