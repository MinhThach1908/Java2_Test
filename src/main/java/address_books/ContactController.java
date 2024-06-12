package address_books;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactController {

    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add(){
        System.out.println("Please enter person's information:");
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter company: ");
        String company = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        scanner.nextLine();
        Contact contact = new Contact();
        contact.setName(name);
        contact.setCompany(company);
        contact.setEmail(email);
        contact.setPhone(phone);
        contacts.add(contact);
    }

    public void findByName(){
        System.out.println("Please enter person's name to find: ");
        String nameToFind = scanner.nextLine();
        Contact c = contacts.get(0);
        if(c.getName().equals(nameToFind)){
            System.out.println("Telephone number: " + c.getPhone());
        } else {
            System.out.println("Not found");
        }
        System.out.println("Enter to continue");
        scanner.nextLine();
    }

    public void display(){
        System.out.println("Show address book.");
        System.out.println("-------------------------------------");
        System.out.printf("%-10s || %-35s || %-35s || %-35s\n", "Contact Name", "Company", "Email", "Phone Number");
        System.out.println("=======================================================================================================================================");
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            System.out.printf("%-10s || %-35s || %-35s || %-35s\n", c.getName(), c.getCompany(), c.getEmail(), c.getPhone());
        }
        System.out.println("Enter to continue");
        scanner.nextLine();
    }
}
