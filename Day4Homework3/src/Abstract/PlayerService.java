package Abstract;

import Entities.Campaign;
import Entities.Player;
import Entities.Product;

public interface PlayerService {
    void add(Player player);
    void update(Player player);
    void delete(Player player);
}
