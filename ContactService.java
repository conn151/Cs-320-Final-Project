package contactService;



import java.util.ArrayList;

public class ContactService {//this class will have list of the contacts 
	
private ArrayList<Contact> contacts; //private arrayList

public ContactService() //this is the beginning of the array list
{

contacts = new ArrayList<>(); //this is where the new array list is created.
}


public boolean addContact(Contact contact){ //function to add contacts to the contacts array list
	boolean contactAlready= false; 
	
	for (Contact contactList:contacts)
		{
			if (contactList.equals(contact)) //test to see if the contact is already a contact in our array; if so, it will make contactAlready = true
				{
					contactAlready = true;
				}
		}

	if (!contactAlready) //this is for new contacts, it will add the contact as a new one.
		{
			contacts.add(contact);//adds new contact to array list contacts

			return true;
		}
	else
		{
		return false; //if it isnt true, it will use this statement to return false.
		}
}


public boolean removeContact(String contactID) //function to delete a contact
{

	for (Contact contactList:contacts)//this will run through the contacts
	{
		//if equals to contactID will remove and return
			if (contactList.getContactID().equals(contactID))//if the ID matches a contactID, it will erase the contact and return
			{

				contacts.remove(contactList);//remove function that removes a contact from the array contacts
				return true;
			}
	}

	return false;
}

//update is trickiest due to needing to make sure still fits parameters
//nothing means no change
public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address)//boolean updateContact
{

for (Contact contactList:contacts)//for loop that will run through the contact list array
{

if (contactList.getContactID().equals(contactID))//if the contact id matches, make sure that each do not have "" and meets the requirements.
{
if(!firstName.equals("") && !(firstName.length()>10)) //if first name and length is not equal
{
contactList.setFirstName(firstName); //set first name
}
if(!lastName.equals("") && !(lastName.length()>10))// if last name and last name length not equal
{
contactList.setFirstName(lastName); //set last name
}
if(!phoneNumber.equals("") && (phoneNumber.length()==10)) //if phone number and phone number length not equal
{
contactList.setFirstName(phoneNumber); //set phone number
}
if(!address.equals("") && !(address.length()>30)) //if address and address length not equal
{
contactList.setFirstName(address); //set address
}
return true; //end it with return true 
}
}
//else return false
return false;
}
}
