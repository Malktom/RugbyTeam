package pl.coderslab.RugbyTeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.RugbyTeam.model.User;
import pl.coderslab.RugbyTeam.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Transactional
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

    public Optional<User> findUserByLoginName(String name) {
        return userRepository.findUserByLogin(name);
    }
}