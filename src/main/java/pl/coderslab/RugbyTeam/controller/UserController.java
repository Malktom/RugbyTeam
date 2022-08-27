package pl.coderslab.RugbyTeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.RugbyTeam.model.User;
import pl.coderslab.RugbyTeam.services.EventService;
import pl.coderslab.RugbyTeam.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path="/list")
    public String getUsersList(Model model){
        List<User> all = (List<User>) userService.getUserList();
        model.addAttribute("users",all);
        return "listUsers";
    }

    @GetMapping("register")
    public String add(Model model){
        model.addAttribute("user", new User());
        return "registerUser";
    }

    @GetMapping("/login")
    public String login(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam("login") String login,
                        @RequestParam("password") String password,
                        HttpSession session) {
        List<User> userList = (List<User>) userService.getUserList();

        for (User user : userList) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                session.setAttribute("user", user);
            }
        }
        if (session.getAttribute("user") != null) {
            return "redirect:/";
        } else {
            return "redirect:/users/login";
        }
    }
}
