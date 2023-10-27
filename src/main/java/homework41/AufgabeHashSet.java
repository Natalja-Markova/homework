package homework41;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.*;

public class AufgabeHashSet {
    /*HashSet:

    a. Создайте объект HashSet<String> с названием .

    b. Добавьте в countriesSet те же страны, что и в countriesList
    (США, Великобритания, Франция, Чехия, Германия ,Франция).

    c. Выведите на экран размер countriesSet.

    d. Выведите на экран все элементы countriesSet.*/
    public static void main(String[] args) {

        Set<String> countriesSet= new HashSet<>();

        countriesSet.add("США");
        countriesSet.add("Великобритания");
        countriesSet.add("Франция");
        countriesSet.add("Чехия");
        countriesSet.add("Германия");
        countriesSet.add("Франция");

        out.println(countriesSet.size());

        for (String name: countriesSet){

            out.println(name);
            out.println(name.hashCode());
        }
       boolean containsSpain = countriesSet.contains("Испания");
        if (!containsSpain) {
            countriesSet.add("Испания");
        }

        out.println("Обновленные элементы countriesSet:");
        for (String country : countriesSet) {
            out.println(country);
        } 
    }

}
