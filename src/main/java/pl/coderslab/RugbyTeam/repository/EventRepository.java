package pl.coderslab.RugbyTeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.RugbyTeam.model.Event;

import java.util.List;
import java.util.Optional;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EventRepository extends JpaRepository<Event, Integer> {

    Optional<Event> findById(Integer Id);
    List<Event> findAllByEventTypeName( String name);
}
