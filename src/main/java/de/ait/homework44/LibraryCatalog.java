package de.ait.homework44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private static final Logger logger = LoggerFactory.getLogger(LibraryCatalog.class);
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
            logger.info("Книга добавлена в каталог: {}", book.getTitle());
        } else {
            logger.error("Попытка добавить нулевую книгу в каталог.");
        }
    }

    public void removeBook(String title) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            books.remove(bookToRemove);
            logger.info("Книга удалена из каталога: {}", title);
        } else {
            logger.info("Книга с названием {} не найдена в каталоге.", title);
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                logger.info("Книга найдена в каталоге: {}", title);
                return book;
            }
        }
        logger.info("Книга с названием {} не найдена в каталоге.", title);
        return null;
    }

    public void listAllBooks() {
        for (Book book : books) {
            logger.info("Название: {}, Автор: {}, Год: {}, ISBN: {}",
                    book.getTitle(), book.getAuthor(), book.getYear(), book.getIsbn());
        }
    }
}

