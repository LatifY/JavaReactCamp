package ETradeProject.business.concretes;

import ETradeProject.business.abstracts.ProductService;
import ETradeProject.core.abstracts.LoggerService;
import ETradeProject.dataAccess.abstracts.ProductDao;
import ETradeProject.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;


    public ProductManager(ProductDao productDao, LoggerService loggerService){
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    public void add(Product product) {
        if(product.getId() < 0 || product.getName().length() < 2 || product.getCategoryId()< 0 || product.getUnitsInStock() < 0 || product.getUnitPrice() < 0){
            loggerService.log("Invalid Product!");
            return;
        }
        productDao.add(product);
    }

    public void update(Product product) {
        if(product.getId() < 0 || product.getName().length() < 2 || product.getCategoryId()< 0 || product.getUnitsInStock() < 0 || product.getUnitPrice() < 0){
            loggerService.log("Invalid Product!");
            return;
        }
        productDao.update(product);
    }

    public void delete(Product product) {
        if(product.getId() < 0 || product.getName().length() < 2 || product.getCategoryId()< 0 || product.getUnitsInStock() < 0 || product.getUnitPrice() < 0){
            loggerService.log("Invalid Product!");
            return;
        }
        productDao.delete(product);
    }

    public Product getById(int id) {
        return productDao.getById(id);
    }

    public List<Product> getAll() {
        return productDao.getAll();
    }
}
