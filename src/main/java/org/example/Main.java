package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nUSER MANAGMENT DETAILS");
            System.out.println("1. Add User");
            System.out.println("2. View All Users");
            System.out.println("3. Delete User");
            System.out.println("4. Search User by ID");
            System.out.println("5. Update User");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> UserCRUD.addUser();
                case 2 -> UserCRUD.viewUsers();
                case 3 -> UserCRUD.deleteUser();
                case 4 -> UserCRUD.searchUserById();
                case 5 -> UserCRUD.updateUser();
                case 6 -> System.out.println("Exiting");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}
