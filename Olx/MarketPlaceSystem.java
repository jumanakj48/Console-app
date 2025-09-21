package Olx;

import java.util.Scanner;

public class MarketPlaceSystem {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        User currentUser = null;
        Scanner sc = new Scanner(System.in);

        while (true) {

            if (currentUser != null) {

                System.out.println("Welcome " + currentUser.getName());
                if (currentUser.getUserType().equals("Seller")) {
                    System.out.println("1.Add product");
                    System.out.println("2.logout");
                    int sellerChoice = sc.nextInt();
                    sc.nextLine();

                    if (sellerChoice == 1) {

                        System.out.println("Enter product name:");
                        String pName = sc.nextLine();
                        System.out.println("Enter product price:");
                        String price = sc.nextLine();
                        System.out.println("Enter product description:");
                        String description = sc.nextLine();
                        System.out.println("Enter product quantity:");
                        int quantity = sc.nextInt();

                        userManagement.addProduct(pName, price, description, quantity);

                    } else if (sellerChoice == 2) {
                        currentUser = null;
                    }

                } else {
                    System.out.println("1.List products");
                    System.out.println("2.Buy product");
                    System.out.println("3.Logout");
                    // System.out.println("4.Buy product");
                    int buyerChoice = sc.nextInt();

                    if (buyerChoice == 1) {
                        System.out.println("======================================");
                        userManagement.listProducts();
                        System.out.println("======================================");

                    } else if (buyerChoice == 2) {

                    } else if (buyerChoice == 3) {
                        currentUser = null;
                    }

                }

            } else {
                System.out.println("1.Register");
                System.out.println("2.Login");
                System.out.println("3.exit");
                System.out.println("Enter ur Choice");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {

                    System.out.println("Enter ur Name");
                    String name = sc.nextLine();
                    System.out.println("Enter ur phnNo");
                    String phn = sc.nextLine();
                    System.out.println("Enter ur password");
                    String password = sc.nextLine();
                    System.out.println("Enter ur address");
                    String address = sc.nextLine();
                    System.out.println("Enter ur usertype");
                    System.out.println("1.Buyer");
                    System.out.println("2.seller");
                    int type = sc.nextInt();

                    String userType = null;
                    if (type == 1)
                        userType = "Buyer";
                    else if (type == 2)
                        userType = "Seller";

                    if (currentUser == null && userType != null) {
                        currentUser = userManagement.register(name, phn, password, address, userType);
                    } else if (userType == null) {
                        System.out.println("Incorrect userType");
                    }
                } else if (choice == 2) {
                    System.out.println("Enter ur phnNo");
                    String phn = sc.nextLine();
                    System.out.println("Enter ur password");
                    String password = sc.nextLine();

                    
                    currentUser = userManagement.login(phn, password);
                    
                     if (currentUser == null)
                        System.out.println("User nOt exist");

                } else if (choice == 3) {
                    System.exit(0);
                } else {
                    System.out.println("Enter correct option");
                }

            }
        }

    }

}
