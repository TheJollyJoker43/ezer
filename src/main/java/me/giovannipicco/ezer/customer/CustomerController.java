package me.giovannipicco.ezer.customer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
@RestController
@RequestMapping("api/ezer/v1/customer")
public class CustomerController {

	private final CustomerService customerService;
	
	@GetMapping(path = "all")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
}
