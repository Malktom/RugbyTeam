package pl.coderslab.RugbyTeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.RugbyTeam.model.Event;
import pl.coderslab.RugbyTeam.model.Player;
import pl.coderslab.RugbyTeam.services.EventService;
import pl.coderslab.RugbyTeam.services.PlayerService;

import java.util.List;

@Controller
@RequestMapping(path="/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping(path="/list")
    public String getPlayersList(Model model){
        List<Player> all = (List<Player>) playerService.getPlayersList();
        model.addAttribute("players",all);
        return "playersList";
    }
}
