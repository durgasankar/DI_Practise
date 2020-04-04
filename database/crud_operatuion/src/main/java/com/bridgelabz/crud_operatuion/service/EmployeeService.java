package com.bridgelabz.crud_operatuion.service;

import com.bridgelabz.crud_operatuion.model.Employee;
import com.bridgelabz.crud_operatuion.model.PersonalInfo;
import com.bridgelabz.crud_operatuion.model.SalaryInfo;
import com.bridgelabz.crud_operatuion.model.dto.EmployeeDto;
import com.bridgelabz.crud_operatuion.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Core business logics are embedded over here.
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-01
 * @version 1.0
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public boolean addNewEmployee(EmployeeDto newEmployeeDto) {
		Employee employee = new Employee();
		if (employeeRepository.findByEmailId(newEmployeeDto.getEmailId()).isPresent())
			return false;
		BeanUtils.copyProperties(newEmployeeDto, employee);
		employee.setPersonalInfo(new PersonalInfo(newEmployeeDto.getPersonalInfo().getFirstName(),
				newEmployeeDto.getPersonalInfo().getLastName(), newEmployeeDto.getPersonalInfo().getFatherName(),
				newEmployeeDto.getPersonalInfo().isMarried()));
		employee.setSalaryInfo(new SalaryInfo(25000, 5, 18));
		System.out.println("printing dto : " + newEmployeeDto);
		System.out.println("Printing employee : " + employee);
		employeeRepository.save(employee);
		return true;

	}

}
