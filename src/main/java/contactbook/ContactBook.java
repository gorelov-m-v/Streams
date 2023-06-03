package contactbook;

import java.util.ArrayList;
import java.util.List;

public class ContactBook<T extends Contact> {
    // Объявите поле класса contacts - список контактов книги
    List<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        // Выведите на экран весь список контактов книги
        for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        Contact contact = contacts.stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
        if (contact == null) {
            System.out.println("Не найден контакт с указанным именем.");
        } else {
            System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
            contact.sendMessage();
        }
    }
}