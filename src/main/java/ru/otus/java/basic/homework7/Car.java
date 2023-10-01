package ru.otus.java.basic.homework7;

import static ru.otus.java.basic.homework7.AreaType.*;

public class Car implements Transport {

    private int petrolLiters;

    private AreaType[] invalidAreaTypes;

    public Car(int petrolLiters) {
        this.petrolLiters = petrolLiters;
        this.invalidAreaTypes = new AreaType[]{FOREST, SWAMP};
    }

    @Override
    public boolean move(AreaType areaType, int kmDistance) {
        for (int i = 0; i < invalidAreaTypes.length; i++) {
            if (invalidAreaTypes[i].equals(areaType)) {
                System.out.println("Невозможно проехать на машине");
                return false;
            }
        }
        if (petrolLiters >= kmDistance) {
            petrolLiters -= kmDistance;
            System.out.println("Была совершена поездка на машине на расстояние " + kmDistance + " км.");

            return true;
        }
        System.out.println("Недостаточно бензина у машины");
        return false;
    }
}
