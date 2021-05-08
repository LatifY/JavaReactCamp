package Day5Homework1.business.concretes;

import Day5Homework1.business.abstracts.CustomerService;
import Day5Homework1.dataAccess.abstracts.CustomerDao;
import Day5Homework1.entities.concretes.Customer;

import java.util.List;

public class CustomerManager implements CustomerService {
    CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    public void add(Customer customer) {
        customerDao.add(customer);
    }

    public void delete(Customer customer) {
        customerDao.delete(customer);
    }

    public void verify(Customer customer) {
        customerDao.verify(customer);
    }

    public Customer getById(int id) {
        return customerDao.getById(id);
    }

    public Customer getByEmail(String email) {
        return customerDao.getByEmail(email);
    }

    public Customer getByEmailAndPassword(String email, String password) {
        return customerDao.getByEmailAndPassword(email,password);
    }

    public List<Customer> getAll() {
        return customerDao.getAll();
    }
}
