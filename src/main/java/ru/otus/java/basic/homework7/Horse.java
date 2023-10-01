package ru.otus.java.basic.homework7;

import static ru.otus.java.basic.homework7.AreaType.SWAMP;

public class Horse implements Transport {
    private int enduranceForKm;
    private AreaType[] invalidAreaTypes;

    public Horse(int enduranceForKm) {
        this.enduranceForKm = enduranceForKm;
        this.invalidAreaTypes = new AreaType[]{SWAMP};
    }

    @Override
    public boolean move(AreaType areaType, int kmDistance) {
        for (int i = 0; i < invalidAreaTypes.length; i++) {
            if (invalidAreaTypes[i].equals(areaType)) {
                System.out.println("Невозможно проехать на коне");
                return false;
            }
        }
        if (enduranceForKm >= kmDistance) {
            enduranceForKm -= kmDistance;
            System.out.println("Была совершена поездка на коне на расстояние " + kmDistance + " км.");
            return true;
        }
        System.out.println("Недостаточно энергии у коня");
        return false;
    }
}
