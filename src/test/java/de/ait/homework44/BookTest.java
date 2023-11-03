package de.ait.homework44;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void testBookProperties() {
        Book book = new Book("Цель. Процесс непрерывного совершенствования", "Элияху Голдратт", 2023, "ISBN12345");
        Book book1 = new Book("Перестаньте угождать людям.", "Патрик Кинг", 2023, "ISBN12346");


        assertEquals("Цель. Процесс непрерывного совершенствования", book.getTitle());
        assertEquals("Элияху Голдратт", book.getAuthor());
        assertEquals(2023, book.getYear());
        assertEquals("ISBN12345", book.getIsbn());
    }
}