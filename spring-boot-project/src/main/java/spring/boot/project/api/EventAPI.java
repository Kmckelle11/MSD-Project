package spring.boot.project.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.project.domain.Event;
import spring.boot.project.repository.EventRepository;

@RestController
@RequestMapping("/events")
public class EventAPI {
	
	@Autowired
	EventRepository repo;
	
	
	@GetMapping
	public Iterable<Event> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/{eventID}")
	public Optional<Event> getEventById(@PathVariable("eventID") long id) {
		return repo.findById(id);
	}

}
