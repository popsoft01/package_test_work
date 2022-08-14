package hospitalManagementApplication.Entity;

import java.time.LocalDate;
import java.util.UUID;

public class Nurse extends User {
    private String id;
    private String password;
    private String phoneNumber;
    private String firstName;
    private String lastName;


    public Nurse(int roleId, String username, LocalDate dob, String userAddress, String email, String id, String password, String phoneNumber, String firstName, String lastName) {
        super(id, roleId, username, dob, userAddress, email);
        setId(id);
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public void setId(String id) {
        this.id = "NUR-" + UUID.randomUUID().toString();
    }

    @Override
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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

    @Override
    public String toString() {
        return "Nurse{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
