package latifyilmaz.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import latifyilmaz.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

}
