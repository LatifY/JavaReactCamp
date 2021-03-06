package ETradeProject.dataAccess.abstracts;

import ETradeProject.entities.concretes.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);

    Product getById(int id);
    List<Product> getAll();
}
