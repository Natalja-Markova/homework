package de.ait.homework47;

import java.util.*;

public class CurrencyConverter {
    /*Задание: "Конвертер валют с обработкой исключений"

Создайте программу на Java, которая конвертирует введённую пользователем сумму из одной валюты в другую. Пользователь должен ввести исходную сумму, исходную валюту и целевую валюту.
 Программа должна рассчитать конвертированную сумму и вывести результат. В процессе выполнения задания необходимо учесть обработку исключений.


Требования к программе:

Запросите у пользователя сумму для конвертации.
Запросите у пользователя исходную и целевую валюту.
Используйте предопределенные курсовые значения для конвертации (например, 1 USD = 0.85 EUR, 1 EUR = 1.2 USD и т.д.).
Реализуйте метод convertCurrency, который принимает сумму и валюты, выполняет конвертацию и возвращает результат.
Используйте блок try-catch для обработки следующих исключений:
NumberFormatException, если пользователь вводит не числовое значение для суммы.
IllegalArgumentException, если введен несуществующий код валюты.
Программа должна повторно запрашивать ввод, если было выброшено исключение.
В конце операции выводите сообщение о том, что операция конвертации завершена.
Пример вывода программы:

Введите сумму для конвертации: 100
Введите исходную валюту (USD, EUR): USD
Введите целевую валюту (USD, EUR): EUR
Результат конвертации: 85 EUR
Операция конвертации завершена.
Или в случае ошибки:

Введите сумму для конвертации: сто
Ошибка: Введено не числовое значение.
Введите сумму для конвертации: 100
Введите исходную валюту (USD, EUR): USD
Введите целевую валюту (USD, EUR): ABC
Ошибка: Несуществующий код валюты.*/
    public static Map<String, Double> eurToOtherCurrency = new HashMap<>() {
        {
            put("USD", 1.07);
            put("GBP", 0.88);
            put("SEK", 11.59);
            put("PLN", 4.44);
        }
    };

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для конвертации ");
        boolean flagForSumma = false;
        boolean flagForCurr = false;
        double userInputSumma = 0;

        String currency = "";
        while (!flagForSumma) {
            try {
                userInputSumma = scanner.nextDouble();
                flagForSumma = true;
                System.out.print("Введите исходную валюту ");
                System.out.print(" (");
                for (String curr : eurToOtherCurrency.keySet()) {
                    System.out.print(" " + curr);
                }
                System.out.println(")");

                currency = scanner.next();
                while (!flagForCurr) {
                    try {
                        double sum = eurToOtherCurrency.get(currency);
                        flagForCurr = true;
                    } catch (NullPointerException e) {
                        System.out.println("Ошибка: Несуществующий код валюты");
                        currency = scanner.next();
                    }

                }


            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введено не числовое значение.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: Несуществующий код валюты");
                scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено не числовое значение.");
                scanner.next();
            }
        }
        double converResult = convertCurrency(userInputSumma, currency);
        System.out.println("Результат конвертации: " + converResult);
        System.out.println("Операция конвертации завершена.");

    }
    public static double convertCurrency(double sum, String currency) {
        double newSum = 0;
        newSum=eurToOtherCurrency.get(currency)*sum;
        return newSum;
    }

    }




