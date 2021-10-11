package hospitalManagementApplication.Entity;

import java.time.LocalDate;

public class Doctor extends User{
    private String id;

    public Doctor(int roleId, String username, LocalDate dob, String userAddress, String email) {
        super(roleId, username, dob, userAddress, email);
    }

    @Override
    public void setId(String id) {

    }
}
