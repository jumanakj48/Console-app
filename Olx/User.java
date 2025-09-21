package Olx;

public class User {
    private String name;
    private String phoneNumber;
    private String password;
    private String address;
    private String userType;


    public User(String name, String phoneNumber, String password, String address, String userType) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.address = address;
        this.userType = userType;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    
}
