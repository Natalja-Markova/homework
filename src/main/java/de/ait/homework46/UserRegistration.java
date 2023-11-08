package de.ait.homework46;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern passPattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#]).{8,}$");

        while (true) {
            System.out.println("Введите имя пользователя или 'exit' для выхода: ");
            String username = scanner.nextLine().trim();

            if (username.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Введите пароль: ");
            String password = scanner.nextLine().trim();

            try {
                registerUser(username, password, passPattern);
                System.out.println("Регистрация успешна.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        System.out.println("Программа завершена.");
    }

    private static void registerUser(String username, String password, Pattern passPattern) {
        if (username.isEmpty()) {
            throw new IllegalArgumentException("Имя пользователя не может быть пустым.");
        }

        Matcher matcher = passPattern.matcher(password);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Пароль не соответствует требованиям:\n- " +
                    "Должен содержать не менее 8 символов.\n- Должен содержать хотя бы одну цифру.\n- " +
                    "Должен содержать хотя бы один из специальных символов: !, @, #.");
        }
    }
}
