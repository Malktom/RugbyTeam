package pl.coderslab.RugbyTeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.RugbyTeam.model.Event;
import pl.coderslab.RugbyTeam.model.EventType;
import pl.coderslab.RugbyTeam.services.EventService;
import pl.coderslab.RugbyTeam.services.EventTypeService;

import java.util.List;

@Controller
@RequestMapping(path="/events")
public class EventController {

    @Autowired
    private EventService eventService;
    @Autowired
    private EventTypeService eventTypeService;


    @GetMapping(path="/list")
    public String getEventsList(Model model){
        List<Event> all = (List<Event>) eventService.getEventsList();
        model.addAttribute("events",all);
        return "eventsList";
    }

    @GetMapping("add")
    public String add(Model model) {
        model.addAttribute("event", new Event());

        return "addEvent";
    }
    @PostMapping("/add")
    public String save(Event event) {

        eventService.save(event);
        return "redirect:/events/list";
    }
    @ModelAttribute("eventTypes")
    public List<EventType> eventTypes(){
        return (List<EventType>) eventTypeService.getEventsTypeList();
    }
}
