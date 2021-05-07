package Day5Homework1.business.abstracts;

import Day5Homework1.entities.concretes.Customer;

public interface AuthService {
    void register(int id, String firstName, String lastName, String email, String password);
    void register(Customer customer);
    void login(String email, String password);
}
