package address_books;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        generateMenu();
    }

    public static void generateMenu() {
        Scanner scanner = new Scanner(System.in);
        ContactController contactController = new ContactController();
        while(true){
            System.out.println("AddressBooks");
            System.out.println("==================");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.println("==================");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    contactController.add();
                    break;
                case 2:
                    contactController.findByName();
                    break;
                case 3:
                    contactController.display();
                    break;
                case 4:
                    System.out.println("Goodbye. Thank you for using the program");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            if(choice == 4){
                break;
            }
        }
    }
}
