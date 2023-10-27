package homework41;

import java.util.ArrayList;
import java.util.Iterator;
import static java.lang.System.*;
public class AufgabeArraylist {
    /*ArrayList:

a. Создайте объект ArrayList<String> с названием countriesList.

b. Добавьте в countriesList следующие страны: США, Великобритания, Франция, Чехия, Германия ,Франция

c. Выведите на экран размер countriesList.

d. Выведите на экран все элементы countriesList в исходном порядке.

e. Удалите дубликаты из countriesList и выведите список снова.*/
    public static void main(String[] args) {
        ArrayList <String> countriesList= new ArrayList<>();

        countriesList.add("США");
        countriesList.add("Великобритания");
        countriesList.add("Франция");
        countriesList.add("Чехия");
        countriesList.add("Германия");
        countriesList.add("Франция");
        out.println(countriesList );
        out.println(countriesList.size());

        Iterator<String> iterator = countriesList.iterator();
        while (iterator.hasNext()) {
            String list = iterator.next();
            if (countriesList.indexOf(list) != countriesList.lastIndexOf(list)) {
                iterator.remove();
            }
        }
        for (String list : countriesList) {
            out.println(list);
        }

        out.println(countriesList.size());
    }
}
