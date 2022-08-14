package stringValidation;

import java.util.InputMismatchException;

public class ValidateInput {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String city;
    private String zip;

    public void setFirstName(String firstName) {
        if (firstName.matches("[A-Z][a-zA-Z]*")) {
            this.firstName = firstName;
        } else throw new InputMismatchException("Please enter the correct name");
    }

    public void setLastName(String lastName) {
        if (lastName.matches("[a-zA-z]+(['-][a-zA-Z])*")) {
            this.lastName = lastName;
        } else throw new InputMismatchException("Please enter the correct last name");
    }

    public void setAddress(String address) {
        if (address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
            this.address = address;
        } else throw new InputMismatchException("Please enter the correct address format");
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}")) {
            this.phoneNumber = phoneNumber;
        } else throw new InputMismatchException("Please enter the correct phone number format");
    }

    public void setCity(String city) {
        if (city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
            this.city = city;
        } else throw new InputMismatchException("Please enter the correct city name format");

    }

    public void setZip(String zip) {
        if (zip.matches("\\d{5}")) {
            this.zip = zip;
        } else throw new InputMismatchException("Please enter the correct zip format");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }
}
