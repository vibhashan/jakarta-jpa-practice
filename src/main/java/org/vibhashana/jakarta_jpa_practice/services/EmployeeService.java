package org.vibhashana.jakarta_jpa_practice.services;

import java.util.List;

import org.vibhashana.jakarta_jpa_practice.entities.Employee;
import org.vibhashana.jakarta_jpa_practice.repos.EmployeeRepo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class EmployeeService {
	@Inject
	private EmployeeRepo empRepo;

	public List<Employee> findEmployees() {
		return empRepo.findEmployees();
	}
}