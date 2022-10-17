package spring.boot.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EVENTS")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	String event_code;
	String description;

	public Event() {
	}

	public Event(long id, String name, String description) {
		super();
		this.id = id;
		this.event_code = name;
		this.description = description;
	}

	public String getName() {
		return event_code;
	}

	public void setName(String name) {
		this.event_code = name;
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
