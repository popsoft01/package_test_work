package stringValidation;

import java.util.Scanner;

public class ValidationMain {
    public static void main(String[] args) {
        ValidateInput input = new ValidateInput();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter zip:");
        String zip = scanner.nextLine();
        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();
        input.setFirstName(firstName);
        input.setLastName(lastName);
        input.setAddress(address);
        input.setCity(city);
        input.setZip(zip);
        input.setPhoneNumber(phone);

        System.out.println("The first name is : " + input.getFirstName());
    }
}
