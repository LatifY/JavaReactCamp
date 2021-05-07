package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class FakeServiceAdapter implements CustomerCheckService{

    public boolean CheckIfRealPerson(Customer customer){
        return true;
    }
}
