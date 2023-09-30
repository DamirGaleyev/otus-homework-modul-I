package ru.otus.java.basic.homework6;

public class CatApplication {
    public static void main(String[] args) {
// Код для одной кошечки
        Plate plate = new Plate(100, 0);
        Cat cat = new Cat("Федя", 100);
        FoodPackage foodPackage = new FoodPackage(500);
        plate.addFood(foodPackage);
        cat.eat(plate);
        plate.addFood(foodPackage);
        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);

        System.out.println();
        System.out.println("А теперь посмотрим реализацию массива");
        System.out.println();


//        Cat[] cat = new Cat[6];
//        cat[0] = new Cat("Федя", 20);
//        cat[1] = new Cat("Вася", 20);
//        cat[2] = new Cat("Иван", 20);
//        cat[3] = new Cat("Евгений", 20);
//        cat[4] = new Cat("Мохнорыл", 20);
//        cat[5] = new Cat("Толстяк", 20);

        Plate plate1 = new Plate(100, 100);
        FoodPackage foodPackage1 = new FoodPackage(100);

// Код для массива кошечек

        Cat[] cats = {
                new Cat("Федя", 20),
                new Cat("Вася", 20),
                new Cat("Иван", 20),
                new Cat("Евгений", 20),
                new Cat("Мохнорыл", 20),
                new Cat("Толстяк", 20),
        };

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
            System.out.println(plate1);
        }
        plate1.addFood(foodPackage1);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
            System.out.println(plate1);
        }
    }
}
