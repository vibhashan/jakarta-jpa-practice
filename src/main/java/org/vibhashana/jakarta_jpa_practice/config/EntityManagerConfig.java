package org.vibhashana.jakarta_jpa_practice.config;

import java.util.HashMap;
import java.util.Map;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@ApplicationScoped
public final class EntityManagerConfig {
	private static final String PERSISTENCE_UNIT_NAME = "jakarta-jpa-practice";
	private static final Dotenv dotenv = Dotenv.load();
	private static final String DB_URL = dotenv.get("DB_URL");
	private static final String DB_USER = dotenv.get("DB_USER");
	private static final String DB_PASSWORD = dotenv.get("DB_PASSWORD");

	@Produces
	private EntityManager entityManager() {
		Map<String, String> properties = new HashMap<>();

		properties.put("jakarta.persistence.jdbc.url", DB_URL);
		properties.put("jakarta.persistence.jdbc.user", DB_USER);
		properties.put("jakarta.persistence.jdbc.password", DB_PASSWORD);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, properties);

		return emf.createEntityManager();
	}
}
