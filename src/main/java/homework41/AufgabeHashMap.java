package homework41;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.*;

public class AufgabeHashMap {
    public static void main(String[] args) {

       /* HashMap:

        a. Создайте объект HashMap<String, String> с названием capitalMap.

        b. Добавьте следующие страны и их столицы: - Чехия -  США-  - Вашингтон - Великобритания - Лондон - Франция - Париж - Германия - Берлин c. Выведите на экран размер capitalMap.

                d. Используя цикл, выведите все пары страна-столица из capitalMap.

        e. Замените столицу США с Вашингтон на Сан-Франциско и выведите capitalMap снова.*/

        HashMap<String, String> capitalMap =new HashMap<>();

        capitalMap.put("Чехия","Прага");
        capitalMap.put("США","Вашингтон");
        capitalMap.put("Великобритания","Лондон");
        capitalMap.put("Франция","Париж");
        capitalMap.put("Германия","Берлин");

        out.println("Размер capitalMap: " + capitalMap.size());

        Set<Map.Entry<String, String>> entries = capitalMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            out.println("Страна: " + entry.getKey() + ", Столица: " + entry.getValue());
        }
        capitalMap.put("США", "Сан-Франциско");


        out.println("После замены столицы США:");
        for (Map.Entry<String, String> entry : entries) {
            out.println("Страна: " + entry.getKey() + ", Столица: " + entry.getValue());
        }
    }
}


