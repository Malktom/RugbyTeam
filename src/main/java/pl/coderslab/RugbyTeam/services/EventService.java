package pl.coderslab.RugbyTeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.RugbyTeam.model.Event;
import pl.coderslab.RugbyTeam.repository.EventRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Iterable<Event> getEventsList() {
        return eventRepository.findAll();
    }

    public void save(Event event) {
        eventRepository.save(event);
    }

    public void delete(Integer id) {
        eventRepository.deleteById(id);
    }

    public Optional<Event> edit(Integer id) {
        return eventRepository.findById(id);
    }

    public List<Event> findAllByEventTypeName(String name) {
        return eventRepository.findAllByEventTypeName(name);
    }


}
