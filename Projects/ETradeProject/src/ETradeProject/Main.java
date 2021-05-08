package ETradeProject;

import ETradeProject.business.abstracts.ProductService;
import ETradeProject.business.concretes.ProductManager;
import ETradeProject.core.concretes.jLoggerManagerAdapter;
import ETradeProject.dataAccess.concretes.HibernateProductDao;
import ETradeProject.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new HibernateProductDao(), new jLoggerManagerAdapter());
		Product productNormal = new Product(1,1,"Laptop", 1500, 10);
		Product productFake = new Product(2,-1,"Laptop", -100, -15);
		productService.add(productNormal);
		productService.add(productFake);
	}

}
