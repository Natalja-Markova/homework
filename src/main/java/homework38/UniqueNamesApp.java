package homework38;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Введите имена; введите 'stop', чтобы завершить.");

        Set<String> nameList = new HashSet<>();

        while (true) {
            name = scanner.next();

            // Проверка на ввод "stop" для завершения
            if (name.equalsIgnoreCase("stop")) {
                break;
            }

            // Проверка на пустой ввод
            if (name.isEmpty()) {
                System.out.println("Имя не может быть пустым. Пожалуйста, введите имя.");
                continue;
            }

            // Проверка на наличие цифр в имени
            if (name.matches(".*\\d.*")) {
                System.out.println("Имя не должно содержать цифры. Пожалуйста, введите корректное имя.");
                continue;
            }

            nameList.add(name);
        }

        System.out.println("Уникальные имена:");
        for (String uniqueName : nameList) {
            System.out.println(uniqueName);
        }
    }
}


