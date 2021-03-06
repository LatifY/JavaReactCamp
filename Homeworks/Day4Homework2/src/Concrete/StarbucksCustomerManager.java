package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(){};
    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this();
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer){
        if(customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
        }
        else{
            System.out.println("Not a valid person: " + customer.firstName);
        }
    }
}
