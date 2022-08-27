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

    @GetMapping("register")
    public String add(Model model) {
        model.addAttribute("user", new User());
        return "registerUser";
    }

    @GetMapping("/login")
    public String login(Model model, HttpServletRequest request) {
        model.addAttribute("user", new User());
        HttpSession session = request.getSession();
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam("login") String login,
                        @RequestParam("password") String password,
                        HttpSession session) {
        User user = userService.findByLogin(login);

        if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {

            session.setAttribute("user", user);
        }

        if (session.getAttribute("user") != null) {

            return "redirect:/app/";
        } else {
            return "redirect:/app/users/login";
        }

    }
}
