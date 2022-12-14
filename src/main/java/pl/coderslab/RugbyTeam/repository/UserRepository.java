package pl.coderslab.RugbyTeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.RugbyTeam.model.User;

import java.util.Optional;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Integer> {

 User findByLogin(String login);


 Optional<User> findUserByLogin(String name);
}