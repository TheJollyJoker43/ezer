package me.giovannipicco.ezer.employee;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
}
