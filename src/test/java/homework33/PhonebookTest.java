package homework33;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {
    private Phonebook phonebook;
    private Contact cont=new Contact("Alex","12345");

    @BeforeEach
    void setUp() { phonebook = new Phonebook();
        phonebook.addContact(cont);

    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void testAddContact() {
        assertTrue(phonebook.addContact(new Contact("Aleks","5553")));
    }
    @Test
    public void testAddDuplicateContact() {

        Contact cont2=new Contact("Alex","01765");
        phonebook.addContact(cont);
        assertFalse(phonebook.addContact(cont2));
    }

    @Test
    void testAddNullContact() {
        Contact contact = null;
        assertFalse(phonebook.addContact(contact));

    }

    @Test
    void testDeleteExistingContact() {
        assertTrue(phonebook.deleteContact(cont.getName()));

    }
    @Test
    void testDeleteNonexistentContact() {
        assertFalse(phonebook.deleteContact("Nata"));

    }
    @Test
    void testFindNonexistentContact() {
        assertNull(phonebook.findContactByName("Nata"));

    }

}








