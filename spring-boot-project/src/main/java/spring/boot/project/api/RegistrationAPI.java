package spring.boot.project.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.project.domain.Registration;

@RestController
@RequestMapping("/registration")
public class RegistrationAPI {
	
	ArrayList<Registration> registrationList = new ArrayList<Registration>();
	
	public RegistrationAPI() {
		Registration reg1 = new Registration(1, "Brian", "1", new Date());
		
		registrationList.add(reg1);
	}
	
	@GetMapping
	public Collection<Registration> getAll(){
		return this.registrationList;
	}
	
	@GetMapping("/{registrationId}")
	public Registration getCustomerById(@PathVariable("registrationId")long id) {
		Registration registration = null;
		for (int i = 0; i < registrationList.size(); i++) {
			if (registrationList.get(i).getId() == id) {
				registration = registrationList.get(i);
			}
		}
		return registration;
	}

}
