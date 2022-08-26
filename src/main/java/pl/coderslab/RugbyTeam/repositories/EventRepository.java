package pl.coderslab.RugbyTeam.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.RugbyTeam.model.Event;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EventRepository extends CrudRepository<Event, Integer> {


}