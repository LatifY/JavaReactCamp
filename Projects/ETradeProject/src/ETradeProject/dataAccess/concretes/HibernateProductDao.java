package ETradeProject.dataAccess.concretes;

import ETradeProject.dataAccess.abstracts.ProductDao;
import ETradeProject.entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class HibernateProductDao implements ProductDao {
    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        System.out.println("Hybernate ile eklendi: " + product.getName());
    }

    public void update(Product product) {
        System.out.println("Hybernate ile güncellendi: "+ product.getName());
    }

    public void delete(Product product) {
        System.out.println("Hybernate ile silindi: " + product.getName());
    }

    public Product getById(int id) {
        int index = -1;
        for (var p : products){
            if(p.getId() == id){
                index = products.indexOf(p);
                break;
            }
        }
        if(index != -1){
            return products.get(index);
        }
        return null;
    }

    public List<Product> getAll() {
        return products;
    }
}
