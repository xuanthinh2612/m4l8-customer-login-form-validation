package loginForm.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 5, max = 45)
    private String firstName;

    @Size(min = 5, max = 45)
    private String lastName;
    @Size(min = 10,max = 11)
    private String phoneNumber;

    @Min(18)
    private int age;

    @Email
    private String email;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public boolean supports(Class<?> clazz) {
//        return User.class.isAssignableFrom(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//
//        User user = (User) target;
//        String email = user.getEmail();
//        String phoneNumber = user.getPhoneNumber();
//        ValidationUtils.rejectIfEmpty(errors, "email", "field.empty");
//        if (!email.matches("[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$")) {
//            errors.rejectValue("email", "email.matches");
//        }
//        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "field.empty");
//        if (!phoneNumber.matches("(^$|[0-9]*$)")) {
//            errors.rejectValue("phoneNumber", "phoneNumber.matches");
//        }
//
//    }

}
