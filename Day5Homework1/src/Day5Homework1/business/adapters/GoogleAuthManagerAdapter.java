package Day5Homework1.business.adapters;

import Day5Homework1.GoogleAuth.GoogleAuthManager;
import Day5Homework1.business.abstracts.AuthService;
import Day5Homework1.entities.concretes.Customer;

public class GoogleAuthManagerAdapter implements AuthService {

    GoogleAuthManager googleAuthManager = new GoogleAuthManager();

    public void register(int id, String firstName, String lastName, String email, String password) {
        googleAuthManager.register(id, firstName, lastName, email, password);
    }

    public void register(Customer customer) {
        googleAuthManager.register(customer.getId(), customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPassword());
    }

    public void login(String email, String password) {
        googleAuthManager.login(email, password);
    }
}
