package hospitalManagementApplication.Entity;

import java.time.LocalDate;
import java.util.UUID;

public abstract class User {
    private String id;
    private int roleId;
    private String username;
    private LocalDate dob;
    private String userAddress;
    private String email;

    public User() {
    }

    public User(String id, int roleId, String username, LocalDate dob, String userAddress, String email) {
        setId(id);
        this.roleId = roleId;
        this.username = username;
        this.dob = dob;
        this.userAddress = userAddress;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public abstract void setId(String id);

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", roleId=" + roleId +
                ", username='" + username + '\'' +
                ", dob=" + dob +
                ", userAddress='" + userAddress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
