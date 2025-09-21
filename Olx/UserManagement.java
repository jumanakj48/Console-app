package Olx;

import java.util.ArrayList;
import java.util.HashMap;

public class UserManagement {

    ArrayList<User> userList;
    ArrayList<product> productList;
    HashMap<String, User> userCatalog;
    HashMap<String, product> productCatalog;

    public UserManagement() {
        this.userList = new ArrayList<>();
        this.productList = new ArrayList<>();
        this.userCatalog = new HashMap<>();
        this.productCatalog = new HashMap<>();

    }

    @SuppressWarnings("unused")
    public User register(String name, String phn, String password, String address, String userType) {

        try {
            User user = new User(name, phn, password, address, userType);
            if (user != null) {
                userCatalog.put(phn, user);
                userList.add(user);
                System.out.println("Registration successful");
                return user;
            } else {
                System.out.println("Something went wrong during registration");
            }
        } catch (Exception e) {
            System.out.println("Error during registration: " + e.getMessage());
        }
        return null;

    }

    public User login(String phn, String password) {

        User user = userCatalog.get(phn);

        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login Success");
            return user;
        } else {
            if (user == null) {
                System.out.println("User does not exist");
            } else {
                System.out.println("Invalid password");
            }
        }
        return null;

    }

    @SuppressWarnings("unused")
    public void addProduct(String productName, String price, String description, int quantity) {

        product Product = new product(productName, price, description, 0);

        if (Product != null) {
            productList.add(Product);

        } else
            System.out.println("Somthing went wrong");

    }

    public void listProducts() {
        for (product Product : productList) {
            System.out.println("--------------------------------");
            System.out.println("Product id:" + Product.getProductId());
            System.out.println("Product Name:" + Product.getProductName());
            System.out.println("Product price:" + Product.getPrice());
            System.out.println("Product description:" + Product.getProductDescription());
            System.out.println("Product quantity:" + Product.getQuantity());
            System.out.println("--------------------------------");
        }
    }

    public ArrayList<User> getUserList() {
        return this.userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<product> getProductList() {
        return this.productList;
    }

    public void setProductList(ArrayList<product> productList) {
        this.productList = productList;
    }

    public HashMap<String, User> getUserCatalog() {
        return this.userCatalog;
    }

    public void setUserCatalog(HashMap<String, User> userCatalog) {
        this.userCatalog = userCatalog;
    }

}
