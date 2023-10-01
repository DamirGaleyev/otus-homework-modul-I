package ru.otus.java.basic.homework7;

public class Human implements HumanAction {

    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void takeTransport(Transport transport) {
        currentTransport = transport;
    }

    @Override
    public void leaveTransport() {
        currentTransport = null;
    }

    @Override
    public boolean move(AreaType areaType, int kmDistance) {
        if (currentTransport != null) {
            currentTransport.move(areaType, kmDistance);
            return false;
        }
        System.out.println("Человек прошел путь " + kmDistance + " км.");
        return true;
    }
}
