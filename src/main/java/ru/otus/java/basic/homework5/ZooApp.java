package ru.otus.java.basic.homework5;

public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Федя", 20, 0, 50);
        Dog dog = new Dog("Дворняга", 20, 2, 150);
        Horse horse = new Horse("Стрела", 100, 5, 1000);

        System.out.println("Лошадь - беги");
        System.out.println();

        horse.run(100);
        horse.info();
        horse.run(100);
        horse.info();
        horse.run(100);
        horse.info();
        horse.run(100);
        horse.info();
        System.out.println();

        System.out.println("Лошадь - плыви");
        System.out.println();

        horse.swim(100);
        horse.info();
        horse.swim(100);
        System.out.println();

        System.out.println("Кошечка - беги");
        System.out.println();
        cat.run(50);
        cat.info();
        System.out.println();

        System.out.println("Кошечка - плыви");
        cat.swim(2);
        System.out.println();

        System.out.println("Собака - беги");
        dog.run(25);
        dog.info();
        System.out.println();

        System.out.println("Собака - плыви");
        System.out.println();

        dog.swim(25);
        dog.info();
        dog.swim(25);
        dog.info();
        dog.swim(25);
        dog.info();

    }
}