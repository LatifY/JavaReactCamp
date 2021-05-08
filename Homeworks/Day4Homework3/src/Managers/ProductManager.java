package Managers;

import Abstract.ProductService;
import Entities.Campaign;
import Entities.Player;
import Entities.Product;

public class ProductManager implements ProductService {
    public void add(Product product) {
        System.out.println("Product Added: " + product.toString());
    }

    public void update(Product product) {
        System.out.println("Product updated: " + product.toString());

    }

    public void delete(Product product) {
        System.out.println("Product deleted: " + product.toString());
    }

    public void buy(Player player, Product product){
        System.out.println(String.format("Player: %s[%s] bought => Product: %s[%s] (Price: %s)", player.userName, player.id, product.name, product.id,product.price));
    }

    public void buy(Player player, Product product, Campaign campaign){
        float price = product.price * campaign.discount / 100;
        System.out.println(String.format("Player: %s[%s] bought => Product: %s[%s] (Price: %s)", player.userName, player.id, product.name, product.id, price));
    }
}
