package Day5Homework1.dataAccess.abstracts;

import Day5Homework1.entities.concretes.Customer;

import java.util.List;

public interface CustomerDao {
    void add(Customer customer);
    void delete(Customer customer);
    void verify(Customer customer);
    Customer getById(int id);
    Customer getByEmail(String email);
    Customer getByEmailAndPassword(String email, String password);
    List<Customer> getAll();
}
