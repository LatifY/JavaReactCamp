package Day5Homework1;

import Day5Homework1.business.abstracts.AuthService;
import Day5Homework1.business.abstracts.CustomerService;
import Day5Homework1.business.adapters.GoogleAuthManagerAdapter;
import Day5Homework1.business.concretes.AuthManager;
import Day5Homework1.business.concretes.CustomerManager;
import Day5Homework1.business.concretes.CustomerValidationManager;
import Day5Homework1.dataAccess.abstracts.CustomerDao;
import Day5Homework1.dataAccess.concretes.InMemoryCustomerDao;
import Day5Homework1.entities.concretes.Customer;

public class Main {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerManager(new InMemoryCustomerDao());
        AuthService authService = new AuthManager(customerService, new CustomerValidationManager());

        //Customers
        Customer c1 = new Customer(1, "Latif", "Yılmaz", "latif@gmail.com", "123password");
        Customer c2 = new Customer(2, "Latif", "Yılmaz", "latif@gmail.com", "123password");
        Customer c3 = new Customer(3, "Latif", "Yılmaz", "latif2@gmail.com", "123");
        Customer c4 = new Customer(4, "Latif", "Yılmaz", "latifgmail.com", "123password");
        Customer c5 = new Customer(5, "L", "Y", "latif3@gmail.com", "123password");
        Customer c6 = new Customer(6, "Steve", "Jobs", "steve@gmail.com", "password123");
        Customer c7 = new Customer(7, "Bill", "Gates", "bill@gmail.com", "password123");

        authService.register(c1); // Successful
        authService.register(c2); // Unsuccessful: Email already exists!
        authService.register(c3); // Unsuccessful: Password must be at least 6 character long!
        authService.register(c4); // Unsuccessful:  Wrong Email format!
        authService.register(c5); // Unsuccessful: First and Last names must be at least 2 character long!
        authService.register(c6); // Successful
        authService.register(c7); // Successful

        authService.login("latif@gmail.com", "123password"); // Unsuccessful: Unverified Email
        customerService.verify(c1);
        authService.login("latif@gmail.com", "123password"); // Successful

        customerService.delete(c7);

        AuthService authService2 = new GoogleAuthManagerAdapter();
        authService2.register(1, "Latif", "Yılmaz", "latifo@gmail.com", "123password");
        authService2.login("latifo@gmail.com", "123password");
    }
}
