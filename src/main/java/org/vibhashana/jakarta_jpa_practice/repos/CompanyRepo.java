package org.vibhashana.jakarta_jpa_practice.repos;

import java.util.List;

import org.vibhashana.jakarta_jpa_practice.entities.Company;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class CompanyRepo {
	@Inject
	private EntityManager em;

	public List<Company> findCompanies() {
		return em.createQuery("SELECT c FROM Company c", Company.class).getResultList();
	}
}
