package de.ait.homework44;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryCatalogTest {
    private LibraryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new LibraryCatalog();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Цель. Процесс непрерывного совершенствования", "Элияху Голдратт", 2023, "ISBN12345");
        catalog.addBook(book);

        assertTrue(catalog.findBookByTitle("Цель. Процесс непрерывного совершенствования") != null);
    }

    @Test
    public void testRemoveBook() {
        Book book = new Book( "Цель. Процесс непрерывного совершенствования", "Элияху Голдратт",2023, "ISBN12345");
        catalog.addBook(book);

        catalog.removeBook("Цель. Процесс непрерывного совершенствования");

        assertTrue(catalog.findBookByTitle("Цель. Процесс непрерывного совершенствования") == null);
    }

    @Test
    public void testFindBookByTitle() {
        Book book = new Book("Цель. Процесс непрерывного совершенствования", "Элияху Голдратт", 2023, "ISBN12345");
        catalog.addBook(book);

        Book foundBook = catalog.findBookByTitle("Цель. Процесс непрерывного совершенствования");

        assertNotNull(foundBook);
        assertEquals("Цель. Процесс непрерывного совершенствования", foundBook.getTitle());
    }
}
