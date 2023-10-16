package homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("1", "Test 1", "Test 12");
    }
    @Test
    void testConstructor() {
        assertEquals("1", book.getIsbn());
        assertEquals("Test 1", book.getTitle());
        assertEquals("Test 12", book.getAuthor());
    }
    @Test
    void testGettersAndSetters() {
        book.setIsbn("54321");
        book.setTitle("New Title");
        book.setAuthor("New Author");

        assertEquals("54321", book.getIsbn());
        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
    }

}