package pl.coderslab.RugbyTeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.RugbyTeam.model.User;
import pl.coderslab.RugbyTeam.services.EventService;
import pl.coderslab.RugbyTeam.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/app/users")
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/list")
    public String getUsersList(Model model) {
        List<User> all = (List<User>) userService.getUserList();
        model.addAttribute("users", all);
        return "listUsers";
    }

}
