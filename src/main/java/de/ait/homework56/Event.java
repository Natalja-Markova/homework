package de.ait.homework56;

import java.time.LocalDateTime;

public class Event {
    /*
Класс события:
Создайте класс Event, который содержит следующие поля:
String name - название события.
LocalDateTime startDateTime - дата и время начала события.
LocalDateTime endDateTime - дата и время окончания события.
Реализуйте конструкторы, геттеры и сеттеры для этих полей.*/
    private String name;
    LocalDateTime startDateTime;
    LocalDateTime endDateTime;

    public Event(String name, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        this.name = name;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Event{");
        sb.append("name='").append(name).append('\'');
        sb.append(", startDateTime=").append(startDateTime);
        sb.append(", endDateTime=").append(endDateTime);
        sb.append('}');
        return sb.toString();
    }
    /*Планировщик событий:
Разработайте класс EventScheduler, который управляет списком событий.
Добавьте методы для добавления, удаления событий и получения списка всех запланированных событий.
Управление временем событий:

В EventScheduler реализуйте метод, который возвращает список событий, запланированных на конкретную дату.
Разработайте метод, проверяющий, пересекаются ли времена двух разных событий.
Тестирование функционала:

Протестируйте ваше приложение, создавая различные события и проверяя работу всех функций.*/

}
