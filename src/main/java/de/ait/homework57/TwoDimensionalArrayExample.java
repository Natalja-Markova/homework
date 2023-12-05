package de.ait.homework57;

import java.util.Random;

import static java.lang.System.*;


    /*Задание: Работа с двумерным массивом в Java
    Цель: Написать программу на Java, которая выполняет следующие операции с
     двумерным массивом целых чисел.

    В коде должны быть использованы циклы для обработки массива.
    Для генерации случайных чисел используйте класс Random.
    */
		public class TwoDimensionalArrayExample {

			public static void main(String[] args) {
				// Создание и заполнение массива:
				//    Создайте двумерный массив целых чисел размером 5x5.

				int[][] myArray = new int[5][5];
				fillArray(myArray);

				// Вывод массива
				out.println("Исходный массив:");
				printArray(myArray);

				// Поиск максимального элемента и вывод
				int max = findMaxValue(myArray);
				out.println("Максимальное число в массиве: " + max);

				// Расчёт и вывод среднего значения
				double average = calculateAverage(myArray);
				out.println("Среднее значение всех чисел в массиве: " + average);

				// Поиск и вывод чисел, которые больше среднего значения
				out.println("Числа больше среднего значения:");
				printNumbersAboveAverage(myArray, average);
			}

			//    Заполните массив случайными числами от 1 до 100.
			//    Метод для заполнения массива случайными числами от 1 до 100
			private static void fillArray(int[][] array) {
				Random random;
				random = new Random();

				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						array[i][j] = random.nextInt(100) + 1;
					}
				}
			}

			// Метод для вывода массива на экран
			private static void printArray(int[][] array) {
                for (int[] ints : array) {
                    for (int anInt : ints) {
                        out.print(anInt + "\t");
                    }
                    out.println();
                }
			}

			//  Поиск максимального элемента.
			// Метод для поиска максимального элемента в массиве

			private static int findMaxValue(int[][] array) {
				int max = array[0][0];

                for (int[] ints : array) {
                    for (int anInt : ints) {
                        if (anInt > max) {
                            max = anInt;
                        }
                    }
                }

				return max;
			}

			// Метод для вычисления среднего значения всех чисел в массиве
			private static double calculateAverage(int[][] array) {
				int sum = 0;
				int count = 0;

                for (int[] ints : array) {
                    for (int anInt : ints) {
                        sum += anInt;
                        count++;
                    }
                }

				return (double) sum / count;
			}

			// Метод для вывода чисел, которые больше среднего значения
			private static void printNumbersAboveAverage(int[][] array, double average) {
                for (int[] ints : array) {
                    for (int anInt : ints) {
                        if (anInt > average) {
                            out.print(anInt + "\t");
                        }
                    }
                }
				out.println();
			}
		}









