package latifyilmaz.northwind.business.abstracts;

import java.util.List;

import latifyilmaz.northwind.entities.concretes.Product;

public interface ProductService {
     List<Product> getAll();
}
