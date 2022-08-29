package pl.coderslab.RugbyTeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.RugbyTeam.model.User;
import pl.coderslab.RugbyTeam.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public Iterable<User> getUserList() {
        return userRepository.findAll();

    }



    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }
    public void save(User user) {
        userRepository.save(user);
    }
}
