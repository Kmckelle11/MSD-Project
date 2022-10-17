package spring.boot.project.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.project.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {
	
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public CustomerAPI() {
		Customer c1 = new Customer(1, "Brian", "pass", "bknauffjr@gmail.com");
		
		customerList.add(c1);
	}
	
	@GetMapping
	public Collection<Customer> getAll(){
		return this.customerList;
	}
	
	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId")long id) {
		Customer customer = null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getId() == id) {
				customer = customerList.get(i);
			}
		}
		return customer;
	}
	
	@GetMapping("/{customerName}")
	public Customer getCustomerById(@PathVariable("customerName")String name) {
		Customer customer = null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getName() == name) {
				customer = customerList.get(i);
			}
		}
		return customer;
	}

}
