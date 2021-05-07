import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"Latif","Yılmaz", new Date(2005,6,12), "123");
        CustomerCheckService customerCheckService = new MernisServiceAdapter();
        BaseCustomerManager customerManager = new StarbucksCustomerManager(customerCheckService);
        customerManager.save(customer1);
    }
}
