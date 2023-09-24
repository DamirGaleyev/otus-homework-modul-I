package ru.otus.java.basic.homework4;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов Иван Иванович", 1984, "a@mail.ru"),
                new User("Петров Петр Петрович", 1980, "b@mail.com"),
                new User("Васильев Василий Васильевич", 1971, "с@mail.com"),
                new User("Лонгов Семен Альтович", 1975, "с@mail.com"),
                new User("Интов Алексей Контролович", 1990, "d@mail.com"),
                new User("Магомедов Магомед Вахавич", 1998, "e@mail.com"),
                new User("Аюшев Эльдар Клонович", 1992, "f@mail.com"),
                new User("Мила Милочка Йовович", 1988, "g@mail.com"),
                new User("Машина Мария Ивановна", 2000, "h@mail.com"),
        };

        ageMore40(users);
    }

    public static void ageMore40(User[] users) {
        int thisYear = 2023;
        int a = 40;

        for (int i = 0; i < users.length; i++) {
            int sum = thisYear - users[i].getYearOfBirth();
            if (sum > a) {
                System.out.println(users[i].getUserName() + users[i].getYearOfBirth() + users[i].getEmailAddress());
            }
        }
    }
}
