package ru.otus.java.basic.homework6;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    private boolean catSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        if (catSatiety()) {
            System.out.println("кошечка " + name + ":" + " Я сытая кошечка и больше не хочу");
            return;
        }
        if (appetite <= plate.getFood()) {
            plate.setFood(plate.getFood() - appetite);
            System.out.println("кошечка " + name + ": Я наконец то поем..омномном мрррр." + " Кошечка " + name +  " наелась");
            satiety = true;
        } else if (appetite > plate.getFood()) {
            System.out.println("кошечка " + name + ":" + " Слишком мало, что бы пачкать морду. Подсыпть корма хозяин");
            return;
        }

    }
}
