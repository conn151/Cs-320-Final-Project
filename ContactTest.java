package tests;

import org.junit.jupiter.api.Test;

import contactService.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    Contact contact = new Contact("2", "first_Name", "last_Name", "135792468", "this is my address"); //new contact

    @Test
    void getContactID() {//gets contact id
        assertEquals("2", contact.getContactID());//gets contact id
    }

    @Test
    void getFirstName() {//gets first name
        assertEquals("first_Name", contact.getFirstName());//gets first name
    }

    @Test
    void getLastName() {//gets last name
        assertEquals("last_Name", contact.getLastName());//gets last name
    }

    @Test
    void getPhoneNumber() {//gets phone number
        assertEquals("135792468", contact.getPhoneNumber());//gets phone number
    }

    @Test
    void getAddress() {//gets address
        assertEquals("this is my address", contact.getAddress());//gets address
    }

    @Test
    void testToString() {//tests strings
        assertEquals("contact [contactID =2, firstName =first_Name, lastName =last_Name, phoneNumber =135792468, address =this is my address]", contact.toString());
    }

}
