import Adapters.FakeCheckServiceAdapter;
import Entities.Campaign;
import Entities.Player;
import Entities.Product;
import Managers.CampaignManager;
import Managers.PlayerManager;
import Managers.ProductManager;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager(new FakeCheckServiceAdapter());
        ProductManager productManager = new ProductManager();
        CampaignManager campaignManager = new CampaignManager();

        //Player
        Player player1 = new Player(1, "latifyilmaz", "Latif", "Yılmaz", new Date(2000,12,2), "12345678900");
        playerManager.add(player1);

        //Product
        Product product1 = new Product(1,"100 Coin", 19.99f, "Adds 100 Coins to your account!");
        productManager.add(product1);

        //Campaign
        Campaign campaign1 = new Campaign(1, "50% Discount", (byte) 50);
        campaignManager.add(campaign1);

        productManager.buy(player1, product1);
        productManager.buy(player1, product1, campaign1);
    }
}
