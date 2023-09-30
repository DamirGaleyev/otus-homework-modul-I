package ru.otus.java.basic.homework5;

public class Cat extends Animal {
    public Cat(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);

    }
    @Override
    public int swim(int distance) {
        System.out.println("Я не умею плавать, только жрать и срать");
        return -1;
    }
}
