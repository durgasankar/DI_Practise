package com.bridgelabz.crud_operatuion.repository;

import com.bridgelabz.crud_operatuion.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Interface extends JPA repository which gives all CRUD operations
 * functionality
 * 
 * @author Durgasankar Mishra
 * @created 2020-04-04
 * @version 1.0
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Optional<Employee> findByEmailId(String emailId);

}
