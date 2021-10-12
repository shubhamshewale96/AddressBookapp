/**
 * 
 */
/**
 * @author shewale
 *
 */
package com.bl.addressbook;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
	ArrayList<Contacts> contactList = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("*** Welcome To Address Book ***");
		AddressBookMain addressBookMain = new AddressBookMain();
		int ch = 0;
		while (ch == 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("1. = Add Contacts\n2. = Display Contact\n3. = Exit\nEnter Your Choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressBookMain.createContact();
				break;
			case 2:
				addressBookMain.display();
				break;
			case 3:
				ch = 1;
				break;
			default:
				System.out.println("Plz Enter 1 or 2 or 3  only");
				break;
			}
		}
	}

	private void display() {
		// TODO Auto-generated method stub
		for (Contacts b : contactList) {
			System.out.println(b.toString());
		}
	}

	private void createContact() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First Name: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter Last Name: ");
		String lastName = scanner.nextLine();

		System.out.print("Enter Address: ");
		String address = scanner.nextLine();

		System.out.print("Enter City: ");
		String city = scanner.nextLine();

		System.out.print("Enter State: ");
		String state = scanner.nextLine();

		System.out.print("Enter ZipCode: ");
		String zipcode = scanner.nextLine();

		System.out.print("Enter Phone Number: ");
		String number = scanner.nextLine();

		System.out.print("Enter Email id: ");
		String email = scanner.nextLine();

		Contacts contact = new Contacts(firstName, lastName, address, city, state, zipcode, number, email);
		contactList.add(contact);
		System.out.println("\nContact Added.......\n");
	}
}