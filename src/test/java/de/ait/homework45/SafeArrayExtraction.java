package de.ait.homework45;

import java.util.ArrayList;
import java.util.Scanner;

public class SafeArrayExtraction {
    public static void main(String[] args) {
        ArrayList<String> fruitsList = new ArrayList<>();

        // Добавление строк в список
        fruitsList.add("Яблоко");
        fruitsList.add("Банан");
        fruitsList.add("Черешня");
        fruitsList.add("Дыня");
        fruitsList.add("Ежевика");

        Scanner scanner = new Scanner(System.in);
        String userInput;
        String fruit = null;

        while (true) {
            try {
                System.out.print("Введите индекс элемента для извлечения: ");
                userInput = scanner.next();
                int index = Integer.parseInt(userInput);

                if (index < 0 || index >= fruitsList.size()) {
                    throw new ArrayIndexOutOfBoundsException();
                }

                fruit = fruitsList.get(index);
                System.out.println("Извлеченный элемент: " + fruit);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введено не число.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: Индекс за пределами границ массива.");
            } finally {
                System.out.println("Операция поиска завершена.");
            }

            System.out.print("Хотите попробовать снова? (да/нет): ");
            userInput = scanner.next().toLowerCase();
            if (!userInput.equals("да")) {
                break;
            }
        }
        scanner.close();
    }
}