package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC2 {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Contact> person = new ArrayList<>();

	public static void main(String[] args) {

		AddressBookUC2 addressBook = new AddressBookUC2();
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
				quite = true;
				break;
			}
		}
	}

	public void printDetails() {
		System.out.println("Welcome to Address Book.");
		System.out.println("\t Press 0 to Print Choice Options : ");
		System.out.println("\t Press 1 to Add the contact details : ");
		System.out.println("\t Press 2 to Exit the Address Book App : ");
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
}
