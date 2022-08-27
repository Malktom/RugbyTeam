package pl.coderslab.RugbyTeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.RugbyTeam.model.Event;
import pl.coderslab.RugbyTeam.model.Player;
import pl.coderslab.RugbyTeam.services.EventService;
import pl.coderslab.RugbyTeam.services.PlayerService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/app/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping(path="/list")
    public String getPlayersList(Model model){
        List<Player> all = (List<Player>) playerService.getPlayersList();
        model.addAttribute("players",all);
        return "listPlayers";
    }
    @GetMapping("add")
    public String add(Model model) {
        model.addAttribute("player", new Player());

        return "addPlayer";
    }
    @PostMapping("/add")
    public String save(@Valid Player player, BindingResult result) {

        if (result.hasErrors()) {
            return "addPlayer";
        }
        playerService.save(player);
        return "redirect:/app/players/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        playerService.delete(id);
        return "redirect:/app/players/list";
    }
    @RequestMapping("edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<Player> byId = playerService.edit(id);
        model.addAttribute("player",byId);
        return "addPlayer";
    }
    @PostMapping("/edit/{id}")
    public String edit(Player player) {
        playerService.save(player);
        return "redirect:/app/players/list";
    }
    @ModelAttribute("positions")
    public List<String> positions(){
        return List.of("Prop","Hooker","Second Row"," Flanker","Number 8","Scrum-Half", "Fly-Half", "Winger","Center", "Full Back"); //TODO enum
    }
}
