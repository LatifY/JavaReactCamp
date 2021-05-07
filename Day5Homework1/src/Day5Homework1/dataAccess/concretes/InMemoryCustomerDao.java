package Day5Homework1.dataAccess.concretes;

import Day5Homework1.dataAccess.abstracts.CustomerDao;
import Day5Homework1.entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCustomerDao implements CustomerDao {
    private List<Customer> customers = new ArrayList<>();


    public void add(Customer customer) {
        customers.add(customer);
    }

    public void delete(Customer customer) {
        customers.remove(customer);
    }

    public void verify(Customer customer) {
        customer.setVerified(true);
    }

    public Customer getById(int id) {
        for(var c : customers){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public Customer getByEmail(String email) {
        for(var c: customers){
            if(c.getEmail() == email){
                return c;
            }
        }
        return null;
    }

    public Customer getByEmailAndPassword(String email, String password) {
        for(var c : customers){
            if(c.getEmail() == email && c.getPassword() == password){
                return c;
            }
        }
        return null;
    }

    public List<Customer> getAll() {
        return customers;
    }
}
