package ru.otus.java.basic.homework7;

import static ru.otus.java.basic.homework7.AreaType.SWAMP;

public class Bike implements Transport {
    private AreaType[] invalidAreaTypes;

    public Bike() {
        this.invalidAreaTypes = new AreaType[]{SWAMP};
    }

    @Override
    public boolean move(AreaType areaType, int kmDistance) {
        for (int i = 0; i < invalidAreaTypes.length; i++) {
            if (invalidAreaTypes[i].equals(areaType)) {
                System.out.println("Невозможно проехать на велосипеде");
                return false;
            }
        }
        System.out.println("Была совершена поездка на велосипеде на расстояние " + kmDistance + " км.");
        return true;
    }
}
