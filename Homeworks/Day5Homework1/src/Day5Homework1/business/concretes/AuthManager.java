package Day5Homework1.business.concretes;

import Day5Homework1.business.abstracts.AuthService;
import Day5Homework1.business.abstracts.CustomerService;
import Day5Homework1.business.abstracts.CustomerValidationService;
import Day5Homework1.dataAccess.abstracts.CustomerDao;
import Day5Homework1.entities.concretes.Customer;

public class AuthManager implements AuthService {
    CustomerService customerService;
    CustomerValidationService customerValidationService;

    public AuthManager(CustomerService customerService, CustomerValidationService customerValidationService){
        this.customerService = customerService;
        this.customerValidationService = customerValidationService;
    }

    public void register(int id, String firstName, String lastName, String email, String password) {
        Customer customer = new Customer(id, firstName, lastName, email, password);
        String validationResult = customerValidationService.validateCustomer(customer);
        if(validationResult != ""){
            System.out.println(validationResult);
            return;
        }
        if(customerService.getByEmail(email) != null){
            System.out.println("Email already exists!");
            return;
        }
        System.out.println("Register Successful:" + customer.getInfoText()+ " [A Verification Email sent!]");
        customerService.add(customer);
    }


    public void register(Customer customer){
        String validationResult = customerValidationService.validateCustomer(customer);
        if(validationResult != ""){
            System.out.println(validationResult);
            return;
        }
        if(customerService.getByEmail(customer.getEmail()) != null){
            System.out.println("Email already exists!");
            return;
        }
        System.out.println("Register Successful:" + customer.getInfoText()+ " [A Verification Email sent!]");
        customerService.add(customer);
    }

    public void login(String email, String password) {
        Customer customer = customerService.getByEmailAndPassword(email, password);

        if(customer == null){
            System.out.println("No such user found!");
            return;
        }
        if(!customer.getVerified()){
            System.out.println("Please verify your email!");
            return;
        }
        System.out.println("Login successful: " + customer.getInfoText());
    }
}
