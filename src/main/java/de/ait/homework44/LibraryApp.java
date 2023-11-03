package de.ait.homework44;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        Scanner scanner = new Scanner(System.in);
         Book book =new Book("Цель. Процесс непрерывного совершенствования", "Элияху Голдратт", 2023, "ISBN12345");
         Book book1 = new Book("Перестаньте угождать людям.", "Патрик Кинг", 2023, "ISBN12346");
        catalog.addBook(book1);
        catalog.addBook( book);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Удалить книгу");
            System.out.println("3. Найти книгу по названию");
            System.out.println("4. Показать все книги");
            System.out.println("0. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.println("Введите автора: ");
                    String author = scanner.nextLine();
                    System.out.println("Введите год выпуска: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Считываем перевод строки
                    System.out.println("Введите ISBN: ");
                    String isbn = scanner.nextLine();

                    Book newBook = new Book(title, author, year, isbn);
                    catalog.addBook(newBook);
                    break;
                case 2:
                    System.out.println("Введите название книги для удаления: ");
                    String titleToRemove = scanner.nextLine();
                    catalog.removeBook(titleToRemove);
                    break;
                case 3:
                    System.out.println("Введите название книги для поиска: ");
                    String titleToFind = scanner.nextLine();
                    Book foundBook = catalog.findBookByTitle(titleToFind);
                    if (foundBook != null) {
                        System.out.println("Найденная книга: " + foundBook);
                    } else {
                        System.out.println("Книга не найдена.");
                    }
                    break;
                case 4:
                    System.out.println("Список всех книг в каталоге:");
                    catalog.listAllBooks();
                    break;
                case 0:
                    System.out.println("Выход из приложения.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неправильный выбор.");
            }
        }
    }
}

