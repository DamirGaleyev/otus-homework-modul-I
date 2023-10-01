package ru.otus.java.basic.homework7;

public interface HumanAction {
    void takeTransport(Transport transport);
    void leaveTransport();
    boolean move(AreaType areaType, int kmDistance);
}
