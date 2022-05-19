package me.giovannipicco.ezer.employee;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
@RestController
@RequestMapping(path = "api/ezer/v1/employee")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@GetMapping("all")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

}
