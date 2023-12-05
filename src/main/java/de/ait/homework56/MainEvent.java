package de.ait.homework56;

import java.time.LocalDateTime;
import java.util.List;

public class MainEvent {

        public static void main(String[] args) {
            EventScheduler scheduler = new EventScheduler();

            // Создаем события
            Event event1 = new Event("Празднование Рождества", LocalDateTime.of(2023, 12, 3, 10, 0),
                    LocalDateTime.of(2023, 12, 3, 12, 0));
            Event event2 = new Event("Собрание", LocalDateTime.of(2023, 12, 3, 13, 0),
                    LocalDateTime.of(2023, 12, 3, 15, 0));

            // Добавляем события в планировщик
            scheduler.addEvent(event1);
            scheduler.addEvent(event2);

            // Получаем все события
            List<Event> allEvents = scheduler.getAllEvents();
            System.out.println("Все события:");
            for (Event event : allEvents) {
                System.out.println(event.getName() + " с " + event.getStartDateTime() + " до " + event.getEndDateTime());
            }

            // Получаем события на конкретную дату
            LocalDateTime targetDate = LocalDateTime.of(2023, 12, 3, 0, 0);
            List<Event> eventsOnDate = scheduler.getEventsOnDate(targetDate);
            System.out.println("\nСобытия на " + targetDate.toLocalDate() + ":");
            for (Event event : eventsOnDate) {
                System.out.println(event.getName() + " с " + event.getStartDateTime() + " до " + event.getEndDateTime());
            }

            // Проверяем пересечение времен двух событий
            boolean overlapping = scheduler.areEventsOverlapping(event1, event2);
            System.out.println("\nПересекаются ли времена двух событий? " + overlapping);
        }
    }

