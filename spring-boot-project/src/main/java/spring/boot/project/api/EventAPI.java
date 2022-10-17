package spring.boot.project.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.project.domain.Event;

@RestController
@RequestMapping("/events")
public class EventAPI {
	
	ArrayList<Event> eventList = new ArrayList<Event>();
	
	public EventAPI() {
		Event event1 = new Event(1, "Spring Boot Training", "Project");
		
		eventList.add(event1);
	}
	
	
	@GetMapping
	public Collection<Event> getAll(){
		return this.eventList;
	}
	
	@GetMapping("/{eventID}")
	public Event getEventById(@PathVariable("eventID") long id) {
		Event event = null;
		for (int i = 0; i < eventList.size(); i++) {
			if (eventList.get(i).getId() == id) {
				event = eventList.get(i);
			}
		}
		return event;
	}

}
