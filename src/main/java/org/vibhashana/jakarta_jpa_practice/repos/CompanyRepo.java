package org.vibhashana.jakarta_jpa_practice.repos;

import java.util.List;

import org.vibhashana.jakarta_jpa_practice.entities.Company;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

@ApplicationScoped
public class CompanyRepo {
	@Inject
	private EntityManager em;

	public List<Company> findCompanies() {
		return em.createQuery("SELECT c FROM Company c", Company.class).getResultList();
	}

	public Company findCompany(String id) {
		return em.find(Company.class, Integer.parseInt(id));
	}

	public Company saveCompany(Company company) {
		// Manual transactions are needed for RESOURCE_LOCAL type persistence.
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		em.persist(company);

		transaction.commit();

		return company;
	}
}
