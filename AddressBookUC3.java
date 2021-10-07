package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC3 {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Contact> person = new ArrayList<>();

	public static void main(String[] args) {

		AddressBookUC3 addressBook = new AddressBookUC3();
		addressBook.mainMenu();
	}

	public void mainMenu() {

		boolean quite = false;
		int choice = 0;
		printDetails();

		while (!quite) {
			System.out.println("Enter Your Choice : ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				printDetails();
				break;
			case 1:
				addContacts();
				break;
			case 2:
				editContacts();
				break;
			case 3:
				searchContacts();
				break;
			case 4:
				showAddressBook();
				break;
			case 5:
				quite = true;
				break;
			}
		}
	}

	public void printDetails() {
		System.out.println("Welcome to Address Book.");
		System.out.println("\t Press 0 to Print Choice Options : ");
		System.out.println("\t Press 1 to Add the contact details : ");
		System.out.println("\t Press 2 to Edit the contact details : ");
		System.out.println("\t Press 3 see the Details of Specific person : ");
		System.out.println("\t Press 4 to see Full Address Book : ");
		System.out.println("\t Press 5 to Exit Address Book App : ");
	}

	public void addContacts() {

		System.out.println("Enter First Name : ");
		String fName = scanner.nextLine();
		System.out.println("Enter Last Name : ");
		String lName = scanner.nextLine();
		System.out.println("Enter your City : ");
		String city = scanner.nextLine();
		System.out.println("Enter your State : ");
		String state = scanner.nextLine();
		System.out.println("Enter your Email-ID : ");
		String email = scanner.nextLine();
		System.out.println("Enter your Zip code : ");
		int zip = scanner.nextInt();
		System.out.println("Enter your Mobile Number : ");
		long mNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println();

		person.add(new Contact(fName, lName, city, state, email, zip, mNumber));

	}

	private void editContacts() {
		System.out.println("Enter the Name of the person whose details you want to Edit : ");
		String name = scanner.nextLine();
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getFirstName().equalsIgnoreCase(name)) {
				System.out.println("Enter Updated First Name : ");
				person.get(i).setFirstName(scanner.nextLine());
				System.out.println("Enter Updated Last Name : ");
				person.get(i).setLastName(scanner.nextLine());
				System.out.println("Enter Updated City : ");
				person.get(i).setCity(scanner.nextLine());
				System.out.println("Enter Updated State : ");
				person.get(i).setState(scanner.nextLine());
				System.out.println("Enter Updated Email ID : ");
				person.get(i).setEmail(scanner.nextLine());
				System.out.println("Enter Updated Zip Code : ");
				person.get(i).setZip(scanner.nextInt());
				System.out.println("Enter Updated Mobile Number : ");
				person.get(i).setPhoneNumber(scanner.nextLong());
				scanner.nextLine();
			} else {
				System.out.println("Contact Details are not present. :( ");
			}
		}

	}

	public void searchContacts() {
		System.out.println("Enter your name to search for your details : ");
		String name = scanner.nextLine();
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getFirstName().equalsIgnoreCase(name)) {
				System.out.println(person.get(i));
				break;
			} else
				System.out.println("Person Details are not present.");

		}
	}

	public void showAddressBook() {
		for (Contact c : person) {
			System.out.println(c);
		}
	}

	public void deleteContacts() {
		System.out.println("Enter Person Name to delete all the data related to that Person : ");
		String name = scanner.nextLine();
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getFirstName().equalsIgnoreCase(name)) {
				person.remove(i);
				break;
			} else {
				System.out.println("Entered Name is not matching wih any Persons details.");
			}
		}
	}
}
