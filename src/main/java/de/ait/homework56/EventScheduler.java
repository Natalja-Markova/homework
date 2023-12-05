package de.ait.homework56;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class EventScheduler {
    /*Планировщик событий:
    Разработайте класс EventScheduler, который управляет списком событий.
    Добавьте методы для добавления, удаления событий и получения списка всех запланированных событий.
    Управление временем событий:

    В EventScheduler реализуйте метод, который возвращает список событий, запланированных на конкретную дату.
    Разработайте метод, проверяющий, пересекаются ли времена двух разных событий.*/

        private ArrayList< Event> events;

        public EventScheduler() {
            this.events = new ArrayList<>();
        }

        public void addEvent(Event event) {
            events.add(event);
        }

        public void removeEvent(Event event) {
            events.remove(event);
        }

        public java.util.List<Event> getAllEvents() {
            return events;
        }

        public ArrayList<Event> getEventsOnDate(LocalDateTime date) {
            ArrayList<Event> eventsOnDate = new ArrayList<>();
            for (Event event : events) {
                if (event.getStartDateTime().toLocalDate().equals(date.toLocalDate())) {
                    eventsOnDate.add(event);
                }
            }
            return eventsOnDate;
        }

        public boolean areEventsOverlapping(Event event1, Event event2) {
            return !(event1.getEndDateTime().isBefore(event2.getStartDateTime()) ||
                    event2.getEndDateTime().isBefore(event1.getStartDateTime()));
        }
    }

