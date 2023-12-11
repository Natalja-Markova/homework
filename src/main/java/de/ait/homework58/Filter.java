package de.ait.homework58;


import java.util.Arrays;
import java.util.List;
import static java.lang.System.*;
import static java.util.stream.Collectors.*;

public class Filter {
    //Фильтрация списка: Создайте список строк. Используя лямбда-выражения и метод filter из Stream API, отфильтруйте и выведите на экран все строки, которые начинаются на букву "А".
    //Работа с потоками (Streams): Используйте потоки для обработки коллекций с помощью лямбда-выражений,преобразуйте все строки в списке в верхний регистр.
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Яблоко", "Банан", "Апельсин", "Груша", "Киви");
        List<String> foundFruits = fruits.stream().filter(fruit -> fruit.startsWith("А")).collect(toList());
        out.println(foundFruits);
        List<String> upperCaseFruits = fruits.stream().map(String::toUpperCase).collect(toList());
        out.println(upperCaseFruits);
        out.println("-----------------");

        //Преобразование элементов списка: Имеется список целых чисел. Используя лямбда-выражение, преобразуйте каждое число в его квадрат и сохраните результаты в новом списке.
        List<Integer> integerListNumbers = Arrays.asList(4, 6, 3, 6, 8, 9, 34, 56, 87, 77, 21, 43);
        List<Integer> doubleListNumbers = integerListNumbers.stream().map((x) -> x * x).collect(toList());
        out.println(doubleListNumbers);


        // Лямбда-выражение для работы с потоком данных: Используя поток данных (Stream) из списка целых чисел, напишите лямбда-выражение для фильтрации всех четных чисел и их
        // последующего вывода на экран.
        integerListNumbers.stream().filter(n -> n % 2 == 0).forEach(out::println);

        out.println("---------------");


        // Использование forEach с лямбда-выражениями: Имеется список целых чисел. Используя лямбда-выражение в методе forEach, напечатайте каждый элемент списка.
        List<Integer> integerList = Arrays.asList(4, 6, 3, 6, 8, 9, 34, 56, 87, 77, 21, 43);
        integerList.forEach(out::println);

    }
}


