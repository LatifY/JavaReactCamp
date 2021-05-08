package Abstract;

import Entities.Campaign;
import Entities.Player;
import Entities.Product;

public interface ProductService {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    void buy(Player player, Product product);
    void buy(Player player, Product product, Campaign campaign);
}
