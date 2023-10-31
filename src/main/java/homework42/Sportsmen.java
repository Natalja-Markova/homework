package homework42;

public class Sportsmen {
    /*Задание: Написание unit-тестов для класса "Спортсмен"
Подготовка:
a. Создайте класс Sportsman со следующими полями: - String name (имя спортсмена) - int age (возраст) - String sport (вид спорта) -
int records (рекорд спортсмена)
b. Реализуйте для класса Sportsman геттеры, сеттеры, конструкторы и метод toString.

c. Реализуйте метод updateRecord(int newRecord), который будет обновлять рекорд спортсмена, если newRecord больше текущего рекорда.

Дополнительное задание:

a. Реализуйте метод isEligibleForCompetition(int minAge, int maxAge), который проверяет, соответствует ли возраст спортсмена допустимому
 диапазону для участия в соревнованиях.

b. Напишите тесты для проверки корректности работы метода isEligibleForCompetition.*/
    private String name;
    private int age;
    private String sport;
    private int records;

    public Sportsmen(String name, int age, String sport, int records) {
        this.name = name;
        this.age = age;
        this.sport = sport;
        this.records = records;
    }
    public void updateRecord(int newRecord){
        if(this.records< newRecord){
            this.records= newRecord;
        }

    }
    public boolean isEligibleForCompetition(int minAge, int maxAge){
        return this.age >= minAge && this.age <= maxAge;
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sport='" + sport + '\'' +
                ", records=" + records +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }
}
