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
import java.util.Optional;

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
        return "redirect:/app/events/list";
    }
    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<Event> byId = eventService.edit(id);
        model.addAttribute("event",byId);
        return "addEvent";
    }
    @PostMapping("/edit/{id}")
    public String edit(Event event) {
        eventService.save(event);
        return "redirect:/app/events/list";
    }
    @GetMapping("/{eventType}")
    public String showEventsByType(@PathVariable String eventType, Model model) {
        model.addAttribute("eventByTypeName", eventService.findAllByEventTypeName(eventType));

        return "eventsByTypeName";
    }
    @GetMapping("/types")
    public String get5LatestArticles(Model model) {
        model.addAttribute("eventTypes", eventTypeService.findAll());

        return "eventType";
    }
    @ModelAttribute("eventTypes")
    public List<EventType> eventTypes(){
        return (List<EventType>) eventTypeService.getEventsTypeList();
    }
    @ModelAttribute("players")
    public List<Player> players(){
        return (List<Player>) playerService.getPlayersList();
    }

    @GetMapping("addType")
    public String addType(Model model) {
        model.addAttribute("eventType", new EventType());

        return "addEventType";
    }
    @PostMapping("/addType")
    public String saveType(@Valid EventType eventType, BindingResult result) {

        if (result.hasErrors()) {
            return "addEventType";
        }
        eventTypeService.save(eventType);
        return "redirect:/app/events/types";
    }
}
