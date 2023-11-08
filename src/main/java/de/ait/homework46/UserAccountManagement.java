package de.ait.homework46;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;

public class UserAccountManagement {
    private String name;
    private String password;

    public UserAccountManagement(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*Задание: "Управление учётными записями пользователя без пользовательских исключений"
Цель задания — создать программу для регистрации новых пользователей с проверкой корректности введённых данных, используя стандартные исключения.
Требования к программе:

Программа должна запрашивать у пользователя имя и пароль для создания новой учётной записи.
Имя пользователя не должно быть пустым, и пароль должен соответствовать следующим требованиям:
Не менее 8 символов.
Содержит хотя бы одну цифру.
Содержит хотя бы один специальный символ (например, !, @, #).
Программа должна проверять введённые данные и выдавать соответствующие сообщения об ошибках, используя стандартные исключения, такие как например IllegalArgumentException.
Если введённые данные корректны, программа должна сообщать о успешной регистрации.
Программа должна предоставить возможность повторного ввода данных при возникновении ошибок.
Программа должна завершаться по команде пользователя (например, вводом слова 'exit').

Пример работы программы:
Введите имя пользователя или 'exit' для выхода:
user123
Введите пароль:
pass

Введите имя пользователя или 'exit' для выхода:
user123
Введите пароль:
password!2
Учётная запись успешно создана.

Примечания к реализации:
Используйте методы класса String, такие как contains, length и другие, для проверки условий пароля.*/
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAccountManagement.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Pattern pass = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        String exitOrContinue = "next";
        String clientName= "a";
        String clientPasw = "b";
        UserAccountManagement mngmt = new UserAccountManagement(null, null);
        while (!exitOrContinue.equals("exit")) {
            out.println("Введите имя пользователя или 'exit' для выхода: ");
            LOGGER.info("Введите имя пользователя {} или {} для выхода: \"",clientName,"exit" );
            while (mngmt.getName() == null || clientName.length() < 3) {
                clientName = scanner.nextLine();
                if (clientName.contains("exit")) {
                    exitOrContinue = "exit";
                    break;
                }
                if (clientName.length() > 1) {
                    mngmt.setName(clientName);
                } else out.println("Длина имени должна быть больше 0");
                LOGGER.error("Длина имени должна быть больше 0");
            }
            if (!exitOrContinue.contains("exit")) {
                while (!exitOrContinue.contains("exit") || !pass.matcher(clientPasw).find()) {
                    out.println("Введите пароль: ");
                    LOGGER.info("Введите пароль: {}", clientPasw );

                    clientPasw = scanner.nextLine();
                    if (clientPasw.contains("exit")) {
                        exitOrContinue = "exit";
                        break;
                    }
                    if (pass.matcher(clientPasw).find()) {
                        mngmt.setPassword(clientPasw);
                        exitOrContinue = "exit";
                    } else
                        out.println("Ошибка: Пароль должен быть не менее 8 символов и содержать хотя бы одну цифру и один специальный символ.");
                    LOGGER.error("Ошибка: Пароль должен быть не менее 8 символов и содержать хотя бы одну цифру и один специальный символ.");

                }
            }
        }
        try {
            if (mngmt.getName().length() > 2 && mngmt.getPassword().length() > 5) {
                LOGGER.info("Ваш пользователь зарегестрирован:  имя{}, пароль {}.",clientName,clientPasw);

                out.println("Ваш пользователь зарегестрирован.");
                out.println("Всего ХОРО ШЕГО");
            }
        } catch (NullPointerException e) {
            out.println("Ничего получится в другой раз");
        }
    }
}
