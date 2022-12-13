package restaurant;

import java.io.Serializable;

public class Customer implements Serializable
{
	// Static variables:
	private static final long serialVersionUID = 1L;
	
	// Instance variables:
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	
	// Default Constructor: 
	public Customer()
	{
		name = "";
		email = "";
		phoneNumber = "";
		address = "";
	}
	
	// Customized Constructor: 
	public Customer (String Name, String Email, String phone, String orderAddress)
	{
		name = Name;
		email = Email;
		phoneNumber = phone;
		address = orderAddress;
	}
	
	// Copy Constructor: 
	public Customer (Customer customer)
	{
		name = customer.name;
		email = customer.getEmail();
		phoneNumber = customer.phoneNumber;
		address = customer.address;
	}
	

	// Getters:  
	public String getName() {return name;}
	public String getEmail() {return email;}
	public String getPhoneNumber() {return phoneNumber;}
	public String getAddress() {return address;}

	// Setters: 
	public void setName(String name) {this.name = name;}
	public void setEmail(String email) {this.email = email;}
	public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;	}
	public void setAddress(String address) {this.address = address;}
	
	@Override 
	public String toString()
	{
		String name = "Name: " + getName();
		String email = "Email: " + getEmail();
		String phoneNumber = "Phone number: " + getPhoneNumber();
		String address = "Address: " + getAddress();
		return String.format("%s, %s, %s, %s", name, email, phoneNumber, address); 
	}
}