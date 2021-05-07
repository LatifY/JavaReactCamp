package Day5Homework1.business.abstracts;

import Day5Homework1.entities.concretes.Customer;

public interface CustomerValidationService {
    String validateCustomer(Customer customer);
}
