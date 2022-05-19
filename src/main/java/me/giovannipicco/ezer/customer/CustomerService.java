package me.giovannipicco.ezer.customer;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {

	private final CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(Long id) {
		return customerRepository.getById(id);
	}
	
	public Customer addCustomer(Customer newCustomer) {
		return customerRepository.save(newCustomer);
	}
	
	public Customer editCustomer(Long id, Customer newData) {
		newData.setId(id);
		return customerRepository.save(newData);
	}
	
	public Customer removeCustomer(Customer customer) {
		customerRepository.delete(customer);
		return customer;
	}
	
}
