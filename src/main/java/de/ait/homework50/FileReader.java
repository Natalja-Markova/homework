package de.ait.homework50;


import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class FileReader {


    public static void main(String[] args) {


    /*Задание: Реализация Чтения, Обработки и Записи Файлов в Java

Цель: Написать программу на Java, которая будет читать текст из одного файла, обрабатывать его по заданному правилу, и записывать результат в другой файл.

Шаги:

Создание Файлов:

Создайте два текстовых файла: source.txt и destination.txt.
В source.txt добавьте некоторый текст для обработки.
Реализация Чтения Файла:

Используйте классы из пакета java.io (например, FileReader) для чтения текста из файла source.txt.
Преобразование Текста:

Инвертируйте каждое слово в прочитанном тексте. Например, слово "Java" должно превратиться в "avaJ".
Запись в Файл:

Используйте классы для записи в файл (например, FileWriter), чтобы записать обработанный текст в файл destination.txt.
Обработка Исключений:

Обеспечьте корректную обработку исключений, таких как FileNotFoundException и IOException.
Тестирование:

Проверьте, что программа корректно читает текст из source.txt, обрабатывает его согласно заданному правилу и записывает результат в destination.txt.
*/ System.out.println("Working Directory = " + System.getProperty("user.dir"));
String path=System.getProperty("user.dir");
if(path.contains("natal")) {
path="C:\\Users\\natal\\homework\\src\\main\\java\\de\\ait\\homework50";
}else {

String [] splittedPath=path.split("\\\\");
path=splittedPath[0]+"\\"+splittedPath[1]+"\\"+splittedPath[2]+"\\"+"Desktop";
}
        System.out.println("Please if u not Natalja or natal, please put source file in ur Desktop>\n Path written here   ");
        System.out.println(path);

        try {
            File source = new File(path+"\\source.txt");
            File destination = new File(path+"\\destination.txt");
            destination.createNewFile(); // if file already exists will do nothing
            FileOutputStream oFile = new FileOutputStream(destination, false);
            Scanner myReader = new Scanner(source);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String newData=reverse(data);
                oFile.write((newData+"\n").getBytes());
                System.out.println(data);

            }
            myReader.close();
            oFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("FILE NOT IN RIGHT PATH.");
            e.printStackTrace();
        }
    }
    private static String reverse(String str)
    {
        String newStr="";
        if (str == null || str.equals("")) {
            return str;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            char letter = str.charAt(i);
            newStr=newStr+letter;
        }
        return newStr;
    }
}
