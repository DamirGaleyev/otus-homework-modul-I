package ru.otus.java.basic.homework7;

public class App {

    public static void main(String[] args) {
        Human human = new Human("Боби");
        Transport horse = new Horse(100);
        Transport car = new Car(100);
        Transport atv = new ATV(100);
        Transport bike = new Bike();

        human.takeTransport(car);
        human.move(AreaType.PLAIN, 10);
        human.takeTransport(horse);
        human.move(AreaType.FOREST, 10);
        human.leaveTransport();
        human.move(AreaType.SWAMP, 1000);
        human.takeTransport(bike);
        human.move(AreaType.FOREST, 100);
    }
}
