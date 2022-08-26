package pl.coderslab.RugbyTeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.RugbyTeam.model.Event;
import pl.coderslab.RugbyTeam.services.EventService;

import java.util.List;

@Controller
@RequestMapping(path="/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping(path="/list")
    public String getEventsList(Model model){
        List<Event> all = (List<Event>) eventService.getEventsList();
        model.addAttribute("events",all);
        return "eventsList";
    }
}
