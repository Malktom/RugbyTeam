package pl.coderslab.RugbyTeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.coderslab.RugbyTeam.model.EventType;
import pl.coderslab.RugbyTeam.repository.EventTypeRepository;

@Service
public class EventTypeService {

    @Autowired
    private EventTypeRepository eventTypeRepository;

    public Iterable<EventType> getEventsTypeList() {
        return eventTypeRepository.findAll();
    }

    public void save(EventType eventType){
        eventTypeRepository.save(eventType);
    }
}
