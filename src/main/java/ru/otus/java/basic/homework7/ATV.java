package ru.otus.java.basic.homework7;

public class ATV implements Transport {
    private int petrolLitersForKm;

    public ATV(int petrolLitersForKm) {
        this.petrolLitersForKm = petrolLitersForKm;
    }

    @Override
    public boolean move(AreaType areaType, int kmDistance) {
        if (petrolLitersForKm >= kmDistance) {
            petrolLitersForKm -= kmDistance;
            System.out.println("Была совершена поездка на вездеходе на расстояние " + kmDistance + " км.");
            return true;
        }
        System.out.println("Недостаточно бензина у вездехода");
        return false;
    }
}
