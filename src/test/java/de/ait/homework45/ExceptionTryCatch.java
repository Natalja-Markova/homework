package de.ait.homework45;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryCatch {
    public static void main(String[] args) {

    /*Задание: "Безопасное извлечение элементов из массива"

Напишите программу на Java, которая безопасно извлекает элементы из массива строк, используя индекс, предоставленный пользователем.
Программа должна учитывать возможность возникновения исключений и корректно их обрабатывать.

Требования к программе:
Создайте массив строк с различными значениями (минимум 5 элементов).
Запросите у пользователя индекс элемента, который нужно извлечь из массива.
Напишите метод для безопасного извлечения элемента из массива по индексу.
Используйте блок try-catch для обработки исключений.
Обработайте следующие типы исключений:
ArrayIndexOutOfBoundsException - если пользователь вводит индекс, который выходит за пределы массива.
NumberFormatException - если пользователь вводит не число.
В блоке finally выведите сообщение о том, что операция поиска завершена.
Если извлечение прошло успешно, выведите элемент массива.
Если возникло исключение, выведите соответствующее сообщение об ошибке и позвольте пользователю попробовать снова.
Пример работы программы:

Введите индекс элемента для извлечения: 3
Извлеченный элемент: Apple
Операция поиска завершена.
Введите индекс элемента для извлечения: 10
Ошибка: Индекс за пределами границ массива.
Операция поиска завершена.
Введите индекс элемента для извлечения: два
Ошибка: Введено не число.
Операция поиска завершена.*/
        // Создание ArrayList для строк
        ArrayList<String> fruitsList = new ArrayList<>();

        // Добавление строк в список
        fruitsList.add("Яблоко");
        fruitsList.add("Банан");
        fruitsList.add("Черешня");
        fruitsList.add("Дыня");
        fruitsList.add("Ежевика");
        Scanner scanner = new Scanner(System.in);
        int userInput;
        String fruit = null;
        do {
            try {
                System.out.println("Введите индекс элемента для извлечения: ");
                userInput = scanner.nextInt();
                if (userInput < 0 || userInput >= fruitsList.size()) {
                    throw new IndexOutOfBoundsException();
                }
                fruit = fruitsList.get(userInput);
                System.out.println("Извлеченный элемент: " + fruit);
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено не число.");
                scanner.next();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка: Индекс за пределами границ массива.");
            } finally {
                System.out.println("Операция поиска завершена");
            }
        } while (fruit == null);

    }
}
