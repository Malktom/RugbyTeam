package pl.coderslab.RugbyTeam.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.RugbyTeam.model.Event;
import pl.coderslab.RugbyTeam.model.LoginValidator;
import pl.coderslab.RugbyTeam.model.Player;
import pl.coderslab.RugbyTeam.model.User;
import pl.coderslab.RugbyTeam.repository.EventRepository;
import pl.coderslab.RugbyTeam.repository.PlayerRepository;
import pl.coderslab.RugbyTeam.repository.UserRepository;
import pl.coderslab.RugbyTeam.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import javax.validation.Valid;

@Controller
@RequestMapping(path = "/")
public class MainController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private EventRepository eventRepository;


    @GetMapping("/app")
    public String menuPage() {
        return "landingPage";
    }

    @GetMapping("/")
    public String homePage() {
        return "redirect:/login";
    }


    @GetMapping("/register")
    public String add(Model model) {
        model.addAttribute("user", new User());
        return "registerUser";
    }

    @PostMapping("/register")

    public String save(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {

            return "registerUser";
        } else {
            user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
            userService.save(user);
            return "redirect:/login";
        }
    }

    @GetMapping("/login")
    public String login(Model model, HttpServletRequest request) {
        model.addAttribute("user", new User());
        HttpSession session = request.getSession();
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("login") String login,
                        @RequestParam("password") String password,
                        HttpSession session) {
        User user = userService.findByLogin(login);
        if (BCrypt.checkpw(password, user.getPassword())) {

            session.setAttribute("user", user);
        }
        if (session.getAttribute("user") != null) {

            return "redirect:/app/";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping(path = "/users")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    @GetMapping(path = "/players")
    public @ResponseBody Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @GetMapping(path = "/events")
    public @ResponseBody Iterable<Event> getAllEvents() {
        return eventRepository.findAll();
    }


}