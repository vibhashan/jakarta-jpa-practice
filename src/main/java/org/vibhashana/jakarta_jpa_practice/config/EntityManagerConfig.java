package org.vibhashana.jakarta_jpa_practice.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

@ApplicationScoped
public class EntityManagerConfig {
	private static final String PERSISTENCE_UNIT_NAME = "jakarta-jpa-practice";

	@Produces
	public EntityManager entityManager() {
		return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	}
}
