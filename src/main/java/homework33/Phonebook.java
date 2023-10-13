package homework33;
import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts = new ArrayList();

        public boolean addContact (Contact contact){
            if (contact == null || findContactByName(contact.getName())
                    != null) {
                return false;
            }
            contacts.add(contact);
            return true;
        }
        public boolean deleteContact (String name){
            Contact contact = findContactByName(name);
            if (contact == null) {
                return false;
            }
            contacts.remove(contact);
            return true;
        }
        public Contact findContactByName (String name){
            for (Contact contact : contacts) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    return contact;
                }
            }
            return null;
        }
    }




        // геттеры, сеттеры

   /* Задания для тестирования
1. Тестирование добавления контакта (addContact):
            1.1. testAddValidContact
- Создать новый объект Contact. - Добавить его в Phonebook. - Проверить, что контакт был
    успешно добавлен (можно использовать метод findContactByName).
            1.2. testAddDuplicateContact
- Создать и добавить объект Contact в Phonebook. - Попробовать добавить другой объект
    Contact с тем же именем. - Удостовериться, что второй контакт не был добавлен.
            1.3. testAddNullContact
- Попробовать добавить null в Phonebook. - Удостовериться, что контакт не был добавлен.
2. Тестирование удаления контакта (deleteContact):
            2.1. testDeleteExistingContact
- Создать и добавить объект Contact в Phonebook. - Удалить этот контакт из Phonebook. -
    Удостовериться, что контакт был успешно удален.
2.2. testDeleteNonexistentContact
- Попробовать удалить контакт, которого нет в Phonebook. - Удостовериться, что метод
    возвращает false.
            3. Тестирование поиска контакта по имени (findContactByName):
            3.1. testFindExistingContact
- Создать и добавить объект Contact в Phonebook. - Поиск контакта по имени. -
Удостовериться, что возвращен правильный контакт.
            3.2. testFindNonexistentContact
- Поиск контакта по имени, которого нет в Phonebook. - Удостовериться, что
 возвращается null*/

