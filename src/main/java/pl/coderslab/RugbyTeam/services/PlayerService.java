package pl.coderslab.RugbyTeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.RugbyTeam.model.Player;
import pl.coderslab.RugbyTeam.repository.PlayerRepository;



@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;


    public Iterable<Player> getPlayersList() {
        return playerRepository.findAll();
    }

    public void save(Player player){
        playerRepository.save(player);
    }

    public void delete(Integer id) {
        playerRepository.deleteById(id);
    }
}
