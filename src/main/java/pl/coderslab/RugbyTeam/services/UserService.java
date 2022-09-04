package pl.coderslab.RugbyTeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.RugbyTeam.model.Event;
import pl.coderslab.RugbyTeam.model.User;
import pl.coderslab.RugbyTeam.repository.UserRepository;

import java.util.Optional;


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
    public void delete(Integer id){
        userRepository.deleteById(id);
    }
//    public Optional<User> findByName(String name) {
//        return userRepository.findByName(name);
//    }
}
