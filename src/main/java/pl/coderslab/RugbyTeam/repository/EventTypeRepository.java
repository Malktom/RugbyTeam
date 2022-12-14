package pl.coderslab.RugbyTeam.repository;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.RugbyTeam.model.EventType;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EventTypeRepository extends CrudRepository<EventType, Integer> {


}