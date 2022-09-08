package pl.coderslab.RugbyTeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.RugbyTeam.model.User;
import pl.coderslab.RugbyTeam.repository.UserRepository;
import pl.coderslab.RugbyTeam.services.EventService;
import pl.coderslab.RugbyTeam.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/app/users")
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/list")
    public String getUsersList(@RequestParam Optional<Integer> page,
                               @RequestParam Optional<String> sortBy,
                               Model model) {
        Page<User> all = userRepository.findAll(
                PageRequest.of(page.orElse(0),3,Sort.Direction.ASC,sortBy.orElse("id")));
        List<User> allUsers = all.getContent();
        model.addAttribute("users",allUsers);
        return "listUsers";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        userService.delete(id);
        return "redirect:/app/users/list";
    }

}
