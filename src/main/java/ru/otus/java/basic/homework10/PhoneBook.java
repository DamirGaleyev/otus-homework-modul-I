package ru.otus.java.basic.homework10;

import java.util.*;

public class PhoneBook {
    static Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Евгений", "123-123");
        phoneBook.addContact("Евгений", "123-124");
        phoneBook.addContact("Евгений", "123-125");
        phoneBook.addContact("Семен", "123-126");
        phoneBook.addContact("Старый", "123-127");

        phoneBook.findContact("Евгений");

        phoneBook.containsPhoneNumber("123-127");
    }

    private void containsPhoneNumber(String number) {
        List<String> num = new ArrayList<>();
        for (Map.Entry<String, List<String>> contacts : phoneBook.entrySet()) {
            if (contacts.getValue().contains(number)) {
                System.out.println("Номер найден. Он принадлежит " + contacts.getKey());
                return;
            }
        }
        System.out.println("Номер не найден");
    }

    private void findContact(String name) {
        List<String> numbers = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            numbers = phoneBook.get(name);
            System.out.println(numbers);
        } else {
            System.out.println("Аббонента нет");
        }
    }
    private void addContact(String name, String number) {
        List<String> numbers;
        if (phoneBook.containsKey(name)) {
            numbers = phoneBook.get(name);
        } else {
            numbers = new ArrayList();
            phoneBook.put(name, numbers);
        }
        numbers.add(number);
    }
}

