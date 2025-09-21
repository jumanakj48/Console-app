package library;

import java.util.Scanner;

public class libraryManagementSystem {
    public static void main(String[] args) {

        BookManagement bookManagement = new BookManagement();
        


        bookManagement.addToCatalog("DemonSlayer", "abc");
        bookManagement.addToCatalog("Haikyuu", "xyz");
        bookManagement.addToCatalog("AOT", "qwerty");

        //bookManagement.checkOut("AOT");
        // bookManagement.bookAvailability("AOT");
        // // bookManagement.returnBook("AOT");
        // bookManagement.displayCatalog();

        // @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Library");
            System.out.println("1.Catalog");
            System.out.println("2.Check out");
            System.out.println("3.return ");
            System.out.println("4.Availability check");
            System.out.println("5.Exit");

            System.out.println("Enter a option : ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    bookManagement.displayCatalog();
                    break;
                case 2:
                    System.out.println("Enter Check out Book Name: ");
                    String checkOutBookName = sc.nextLine();
                    bookManagement.checkOut(checkOutBookName);
                    break;
                case 3:
                    System.out.println("Enter returning Book Name: ");
                    String returBookName = sc.nextLine();
                    bookManagement.returnBook(returBookName);
                    break;
                case 4:
                    System.out.println("Enter checking book name: ");
                    String bookName = sc.nextLine();
                    bookManagement.bookAvailability(bookName);
                    break;
                case 5:
                    System.out.println("Thank you for visiting");
                    System.exit(0);

                default:
                    System.out.println("Invalid Option");
                    break;
            }

        }

    }

}
