package pl.coderslab.RugbyTeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.RugbyTeam.model.Event;
import pl.coderslab.RugbyTeam.model.EventType;
import pl.coderslab.RugbyTeam.model.Player;
import pl.coderslab.RugbyTeam.services.EventService;
import pl.coderslab.RugbyTeam.services.EventTypeService;
import pl.coderslab.RugbyTeam.services.PlayerService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(path="/app/events")
public class EventController {

    @Autowired
    private EventService eventService;
    @Autowired
    private EventTypeService eventTypeService;
    @Autowired
    private PlayerService playerService;


    @GetMapping(path="/list")
    public String getEventsList(Model model){
        List<Event> all = (List<Event>) eventService.getEventsList();
        model.addAttribute("events",all);
        return "listEvents";
    }

    @GetMapping("add")
    public String add(Model model) {
        model.addAttribute("event", new Event());

        return "addEvent";
    }
    @PostMapping("/add")
    public String save(@Valid Event event, BindingResult result) {

        if (result.hasErrors()) {
            return "addEvent";
        }
        eventService.save(event);
        return "redirect:/app/events/list";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        eventService.delete(id);
        return "redirect:/app/players/list";
    }
    @ModelAttribute("eventTypes")
    public List<EventType> eventTypes(){
        return (List<EventType>) eventTypeService.getEventsTypeList();
    }
    @ModelAttribute("players")
    public List<Player> players(){
        return (List<Player>) playerService.getPlayersList();
    }
}
