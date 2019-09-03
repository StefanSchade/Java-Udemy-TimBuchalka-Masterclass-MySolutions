package de.stefanschade.learning.timbuch.masterclass.ch08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Challenge_MobilePhone {

    private ArrayList<Challenge_Contacts> contactList;

    public Challenge_MobilePhone() {

        this.contactList = new ArrayList<Challenge_Contacts>();

    }


    public void addContact(String firstName, String lastName, String phoneNumber) {
        Challenge_Contacts contact = new Challenge_Contacts(firstName, lastName, phoneNumber);

        this.contactList.add(contact);

    }

    public void addContact(Scanner scanner) {

        String firstName;
        String lastName;
        String phoneNumber;

        System.out.println();
        System.out.println();
        System.out.println("*******************************");
        System.out.println("*    Add a new Contact        *");
        System.out.println("*******************************");
        System.out.println();

        System.out.println("Please enter a the first name");
        firstName = scanner.nextLine();

        System.out.println("Please enter a the last name");
        lastName = scanner.nextLine();

        System.out.println("Please enter a the phone number");
        phoneNumber = scanner.nextLine();

        addContact(firstName, lastName, phoneNumber);

    }

    public void printAllContacts() {

        System.out.println();
        System.out.println();
        System.out.println("*******************************");
        System.out.println("*    List of Contacts         *");
        System.out.println("*******************************");
        System.out.println();

        Iterator<Challenge_Contacts> it = this.contactList.iterator();

        while (it.hasNext()) {
            Challenge_Contacts contact = it.next();
            System.out.println(contact.toString());
        }
        System.out.println();
        System.out.println("End of List");
    }

    public void printMenue() {

        System.out.println();
        System.out.println();
        System.out.println("*******************************");
        System.out.println("*    MOBILE PHONE CONTACTS    *");
        System.out.println("*******************************");
        System.out.println();
        System.out.println("1 - Add Contact");
        System.out.println("2 - Modify Contact");
        System.out.println("3 - Remove Contact");
        System.out.println("4 - Query Contact");
        System.out.println("5 - Print All Contacts");
        System.out.println("6 - Quit");
        System.out.println();

    }

    public void queryContact(Scanner scanner) {

        String firstName;
        String lastName;
        String phoneNumber;

        System.out.println();
        System.out.println();
        System.out.println("*******************************");
        System.out.println("*    Query Contact            *");
        System.out.println("*******************************");
        System.out.println();

        System.out.println("Please enter a the first name");
        firstName = scanner.nextLine();

        System.out.println("Please enter a the last name");
        lastName = scanner.nextLine();


        firstName = firstName.trim();
        lastName = lastName.trim();


        Iterator<Challenge_Contacts> it = this.contactList.iterator();

        while (it.hasNext()) {
            Challenge_Contacts contact = it.next();

//            is empty is correct
//            System.out.println(firstName == "" ? "A" : "B");
//            System.out.println(firstName.isEmpty()?"A":"B");

//            int a = firstName.compareTo(contact.getFirstName());

            boolean firstNameMatch = firstName.compareTo(contact.getFirstName()) == 0 || firstName.isEmpty();
            boolean lastNameMatch = lastName.compareTo(contact.getLastName()) == 0 || lastName.isEmpty();

//            System.out.println(firstName + " / " + contact.getFirstName() + " -> " + (firstNameMatch ? "match" : "no match"));
//            System.out.println(lastName + " / " + contact.getLastName() + " -> " + (lastNameMatch ? "match" : "no match"));
//            System.out.println();

            if (firstNameMatch && lastNameMatch) {
                System.out.println(contact.toString());

            }
        }
        System.out.println();
        System.out.println("End of List");
    }


    public void menue() {

        Scanner myScanner = new Scanner(System.in);
        boolean hasQuit = false;

        while (!hasQuit) {

            printMenue();

            if (!myScanner.hasNextInt()) {
                System.out.println("Please enter a valid choice!");
            } else {
                int choice = myScanner.nextInt();
                myScanner.nextLine();

                switch (choice) {
                    case 1:
                        this.addContact(myScanner);
                        break;
                    case 2:
                        break;
                    case 3:
                        removeContacts(myScanner);
                        break;
                    case 4:
                        this.queryContact(myScanner);
                        break;
                    case 5:
                        this.printAllContacts();
                        break;
                    case 6:
                        hasQuit = true;
                        break;
                    default:
                        System.out.println("Please enter a valid choice!");
                }

            }

        }

        myScanner.close();


        myScanner.close();

    }

    private void removeContacts(Scanner scanner) {


        String firstName;
        String lastName;
        String phoneNumber;

        System.out.println();
        System.out.println();
        System.out.println("*******************************");
        System.out.println("*    Remove Contact           *");
        System.out.println("*******************************");
        System.out.println();

        System.out.println("Please enter a the first name");
        firstName = scanner.nextLine();

        System.out.println("Please enter a the last name");
        lastName = scanner.nextLine();


        firstName = firstName.trim();
        lastName = lastName.trim();


        Iterator<Challenge_Contacts> it = this.contactList.iterator();

        while (it.hasNext()) {
            Challenge_Contacts contact = it.next();

            boolean firstNameMatch = firstName.compareTo(contact.getFirstName()) == 0 || firstName.isEmpty();
            boolean lastNameMatch = lastName.compareTo(contact.getLastName()) == 0 || lastName.isEmpty();


            if (firstNameMatch && lastNameMatch) {


                it.remove();
            }
        }
        System.out.println();
        System.out.println("End of List");


    }

    public static void main(String[] args) {

        Challenge_MobilePhone phone = new Challenge_MobilePhone();

        phone.addContact("Stefan", "Schade", "123");
        phone.addContact("Nicole", "Schade", "100");
        phone.addContact("Nadine", "Milicevic", "2001");

        phone.menue();

    }

}
