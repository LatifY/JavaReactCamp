package Day5Homework1.business.concretes;

import Day5Homework1.business.abstracts.CustomerValidationService;
import Day5Homework1.entities.concretes.Customer;

import java.util.regex.Pattern;

public class CustomerValidationManager implements CustomerValidationService {

    private final Pattern EMAIL_REGEX =  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private final int firstNameMinLength = 2;
    private final int firstNameMaxLength = 20;

    private final int lastNameMinLength = 2;
    private final int lastNameMaxLength = 20;

    private final int passwordMinLength = 6;
    private final int passwordMaxLength = 60;

    public String validateCustomer(Customer customer) {
        String result = "";
        if(!isFirstNameValid(customer.getFirstName())){
            result = String.format("'First Name' must be at least %s, maximum %s characters long!", firstNameMinLength,firstNameMaxLength);
        }
        else if(!isLastNameValid(customer.getLastName())){
            result = String.format("'Last Name' must be at least %s, maximum %s characters long!", lastNameMinLength,lastNameMaxLength);
        }
        else if(!isEmailValid(customer.getEmail())){
            result = String.format("'Email' format is invalid!");
        }
        else if(!isPasswordValid(customer.getPassword())){
            result = String.format("'Password' must be at least %s, maximum %s characters long!", passwordMinLength,passwordMaxLength);
        }
        return result;
    }

    private boolean isFirstNameValid(String firstName){
        int size = firstName.length();
        if(size >= firstNameMinLength && size < firstNameMaxLength){
            return true;
        }
        return false;
    }

    private boolean isLastNameValid(String lastName){
        int size = lastName.length();
        if(size >= firstNameMinLength && size < firstNameMaxLength){
            return true;
        }
        return false;
    }

    private boolean isEmailValid(String email){
        return EMAIL_REGEX.matcher(email).matches();
    }

    private boolean isPasswordValid(String password){
        int size = password.length();
        if(size >= passwordMinLength && size < passwordMaxLength){
            return true;
        }
        return false;
    }
}
