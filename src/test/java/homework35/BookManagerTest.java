package homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.management.InstanceAlreadyExistsException;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {
    private  BookManager bookManager;

    @BeforeEach
    void setUp() { bookManager=new BookManager();
        bookManager.addBook(new Book("12345", "Joo", "Nata"));

    }

    @Test
    void addBook() {
       Book newBook=new Book("12345", "Jookkk", "NataMa");
        assertThrows(IllegalArgumentException.class, () -> bookManager.addBook(newBook));
    }

    @Test
    void findBookByISBN() {
        assertEquals(null,bookManager.findBookByISBN("1234523123"));
    }

    @Test
    void removeBook() {
        assertEquals(false,bookManager.removeBook("1234523123"));
        assertEquals(true,bookManager.removeBook("12345"));
    }
}