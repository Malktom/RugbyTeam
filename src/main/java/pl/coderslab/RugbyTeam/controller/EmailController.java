package pl.coderslab.RugbyTeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.RugbyTeam.services.MailService;

import javax.mail.MessagingException;

@RestController
public class EmailController {

    private MailService mailService;

    @Autowired
    public EmailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/sendMail")
    public String sendMail() throws MessagingException {
        mailService.sendMail("tomek.maori@gmail.com",
                "Wygrałeś",
                "<b>1000 000 zł</b><br>:P", true);
        return "wysłano";
    }
}
