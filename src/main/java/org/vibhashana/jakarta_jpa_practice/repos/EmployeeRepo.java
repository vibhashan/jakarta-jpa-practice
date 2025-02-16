package org.vibhashana.jakarta_jpa_practice.repos;

import java.util.List;

import org.vibhashana.jakarta_jpa_practice.entities.Employee;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class EmployeeRepo {
	@Inject
	private EntityManager em;

	public List<Employee> findEmployees() {
		return em.createQuery("SELECT e FROM Employee e JOIN FETCH e.company", Employee.class).getResultList();
	}
}
