package pl.coderslab.RugbyTeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.RugbyTeam.model.User;
import pl.coderslab.RugbyTeam.repositories.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public Iterable<User> getUserList() {
        return userRepository.findAll();
    }
}
