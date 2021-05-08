package Managers;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {

    PlayerCheckService playerCheckService;

    public PlayerManager(PlayerCheckService playerCheckService){
        this.playerCheckService = playerCheckService;
    }

    public void add(Player player) {
        if(playerCheckService.CheckPlayer(player)){
            System.out.println("Player Added: " + player.toString());
        }
        else{
            System.out.println("Invalid Player: " + player.toString());
        }
    }

    public void update(Player player) {
        System.out.println("Player Updated: " + player.toString());

    }

    public void delete(Player player) {
        System.out.println("Player Deleted: " + player.toString());
    }
}
