package spring.boot.project.domain;

public class Event {
	
	long id;	
	String name;
	String description;
	
	public Event() {}
	
	public Event(long id, String name, String description) {
		super();
		this.id = id;
		this.name=name;
		this.description=description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
