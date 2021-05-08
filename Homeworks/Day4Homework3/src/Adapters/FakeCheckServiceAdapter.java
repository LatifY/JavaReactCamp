package Adapters;

import Abstract.PlayerCheckService;
import Entities.Player;

public class FakeCheckServiceAdapter implements PlayerCheckService {

    public boolean CheckPlayer(Player player) {
        return player.nationalityId.length() == 11;
    }
}
