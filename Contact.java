package contactService;

public class Contact {
	String contactID; //string for ContactID
	String firstName; //string for firstName
	String lastName;	//string for lastName
	String phoneNumber;	//string for phoneNumber
	String address;	//string for address

	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {//public contact
	super();
	this.contactID = contactID; //set for contactID
	this.firstName = firstName; //set for firstName
	this.lastName = lastName;	//set for lastName
	this.phoneNumber = phoneNumber;	//set for phoneNumber
	this.address = address;	//set for address
	}

	public String getContactID() {  //get function for contactID
		return contactID;
	}

	public void setContactID(String contactID) { //set function for contactID
		this.contactID = contactID;
	}

	public String getFirstName() { //get function for FirstName
		return firstName;
	}

	public void setFirstName(String firstName) { //set function for FirstName
		this.firstName = firstName;
	}

	public String getLastName() { //get function for LastName
		return lastName;
	}

	public void setLastName(String lastName) { //set function for LastName
		this.lastName = lastName;
	}

	public String getPhoneNumber() { //get function for PhoneNumber
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) { //set function for PhoneNumber
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() { //get function for address
		return address;
	}

	public void setAddress(String address) { //set function for address
		this.address = address;
	}

	@Override
	public String toString() { //public string to return the 5 strings
		return "contact [contactID =" + contactID + ", firstName =" + firstName + ", lastName =" + lastName
				+ ", phoneNumber =" + phoneNumber + ", address =" + address + "]";
	}

	}

