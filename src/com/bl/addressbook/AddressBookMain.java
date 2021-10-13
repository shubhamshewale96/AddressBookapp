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
import java.util.Objects;

public class AddressBookMain {
	ArrayList<Contacts> contactList = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("*** Welcome To Address Book ***");
		AddressBookMain addressBookMain = new AddressBookMain();
		int ch = 0;
		while (ch == 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.print(
					"1. = Add Contacts\n2. = Display Contact\n3. = Edit \n4. =Delete \n5. =Exit\nEnter Your Choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressBookMain.createContact();
				break;
			case 2:
				addressBookMain.display();
				break;
			case 3:
				addressBookMain.edit();
				break;
			case 4:
				addressBookMain.delete();
				break;
			case 5:
				ch = 1;
				break;
			default:
				System.out.println("Plz Enter 1 or 2 or 3 or 4  only");
				break;
			}
		}
	}

	private void delete() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name To Remove from Contact list: ");
		String firstName = scanner.nextLine();
		for (int i = 0; i < contactList.size(); i++) {
			if (Objects.equals(firstName, contactList.get(i).getFirstName())) {
				contactList.remove(contactList.get(i));
				System.out.println("\nDeleted Successfully.....\n");
			} else
				System.out.println("The name entered is incorrect.");
		}
	}

	// To Edit contact
	private void edit() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name To Edit from Contact list: ");
		String firstNam = scanner.nextLine();
		for (Contacts value : contactList) {
			if (Objects.equals(firstNam, value.getFirstName())) {
				System.out.print("Enter First Name: ");
				String firstName = scanner.nextLine();
				value.setFirstName(firstName);
				System.out.print("Enter Last Name: ");
				String lastName = scanner.nextLine();
				value.setLastName(lastName);
				System.out.print("Enter Address: ");
				String address = scanner.nextLine();
				value.setAddress(address);
				System.out.print("Enter City: ");
				String city = scanner.nextLine();
				value.setCity(city);
				System.out.print("Enter State: ");
				String state = scanner.nextLine();
				value.setState(state);
				System.out.print("Enter ZipCode: ");
				String zipcode = scanner.nextLine();
				value.setZipCode(zipcode);
				System.out.print("Enter Phone Number: ");
				String number = scanner.nextLine();
				value.setNumber(number);
				System.out.print("Enter Email id: ");
				String email = scanner.nextLine();
				value.setEmail(email);
				System.out.println("\n Success !  contact updated.....\n");

			} else
				System.out.println("The name entered is incorrect.");
		}
	}

	/* To display contact */
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