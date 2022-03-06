package com.bridgelabz.uc3;

import java.util.Scanner;
public class AddressBook {
	Scanner sc = new Scanner(System.in);										
	//Scanner object for User Input 
    Contacts contacts = new Contacts();											
    //Created Contacts Object for Getter and Setter Methods    
public void addNewContact() {												
	//Method to Add New Contact to AddressBook
    System.out.println("Enter the Contact Details -");
    System.out.println("Enter the First Name :");
    contacts.setFirstName(sc.next());
    System.out.println("Enter the Last Name :");
    contacts.setLastname(sc.next());
    System.out.println("Enter the Address :");
    contacts.setAddress(sc.next());
    System.out.println("Enter the City :");
    contacts.setCity(sc.next());
    System.out.println("Enter the State :");
    contacts.setState(sc.next());
    System.out.println("Enter the Zip Code :");
    contacts.setZip(sc.next());
    System.out.println("Enter the Phone Number :");
    contacts.setPhoneNo(sc.next());
    System.out.println("Enter the EMail ID :");
    contacts.setEmailID(sc.next());
	}
public void displayContact() {												  
	//Method to Show the Contact Details
    System.out.println("Contact Details -");
    System.out.println("First Name : "+contacts.getFirstName());
    System.out.println("Last Name : "+contacts.getLastname());
    System.out.println("Address : "+contacts.getAddress());
    System.out.println("City : "+contacts.getCity());
    System.out.println("State : "+contacts.getState());
    System.out.println("Zip Code : "+contacts.getZip());
    System.out.println("Phone Number : "+contacts.getPhoneNo());
    System.out.println("EMail ID : "+contacts.getEmailID());
}
public void editContact() {														  				
	//Method to Edit the Existing Contact
    System.out.println("Enter the First Name : ");												
    //Get First Name to Edit the Contact
    String firstName = sc.next();
if(!firstName.equalsIgnoreCase(contacts.getFirstName())) {								 
	//check if the Given User with First Name
        System.out.println("The Entered Contact Name is Not Available in Address Book");
    } 
    else {
        System.out.println("Enter the Last Name :");
        contacts.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the Zip Code :");
        contacts.setZip(sc.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNo(sc.next());
        System.out.println("Enter the EMail ID :");
            contacts.setEmailID(sc.next());
    }
}	
}