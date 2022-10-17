package spring.boot.project.domain;

public class Customer {

	long id;
	String name;
	String password;
	String email;
	
	public Customer() {}
	
	public Customer(long id, String name, String password, String email) {
		super();
		this.id=id;
		this.name=name;
		this.password=password;
		this.email=email;
	}
	
	public String toJSON() {
		return "{\"id:\"" + id + ", \"name:\"" + name + ", \"password:\"" + password + ", \"email:\"" + email + " }";
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
