package MusicApp;

import java.util.HashMap;

public class Usermanagement {

    HashMap<String, User> userCatalog;

    Usermanagement() {
        userCatalog = new HashMap<>();
    }

    public void addUser(String userName, String phnNumber) {
        User user = new User(userName, phnNumber);
        userCatalog.put(phnNumber, user);
    }

    public void addDevice(String phnNumber, String deviceId) {
        User currentUser = userCatalog.get(phnNumber);
        if (currentUser != null) {
            Device device = new Device(deviceId, currentUser);
            currentUser.getDevices().add(device);
            System.out.println("Device " + deviceId + " added successfully");

        }

    }

    public void displayUser(String phnNumber) {
        User currentUser = userCatalog.get(phnNumber);

        if (currentUser != null) {
            System.out.println("User Name : " + currentUser.getUserName());
            System.out.println("Subscription : " + currentUser.getSubscription());
            System.out.println("Total devices : " + currentUser.getTotalDeviceList());

        } else {

        }

    }

    public User getUser(String phnNUmber) {
        return userCatalog.get(phnNUmber);
    }

    public void purchaseSubscription(){
        
    }

}
