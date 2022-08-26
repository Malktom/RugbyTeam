package pl.coderslab.RugbyTeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.RugbyTeam.model.Event;
import pl.coderslab.RugbyTeam.repositories.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Iterable<Event> getEventsList() {
        return eventRepository.findAll();
    }

    public void save(Event event){
        eventRepository.save(event);
    }
}
