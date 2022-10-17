package spring.boot.project.domain;

import java.util.Date;

public class Registration {
	
	long id;
	String name;
	String customer_id;
	Date registration_date;
	
	public Registration() {}
	
	public Registration(long id, String name, String customer_id, Date registration_date) {
		super();
		this.id=id;
		this.name = name;
		this.customer_id=customer_id;
		this.registration_date=registration_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public Date getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}

	

}
