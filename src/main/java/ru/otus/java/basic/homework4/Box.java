package ru.otus.java.basic.homework4;

public class Box {
    private final String  SIZE;
    private String color;
    private String freeSpace;
    private String openClose;
    String pusto = "пусто";
    String full = "полная";
    String opened = "Открытая";
    String closed = "Закрытая";
    String item;

    public void setColor(String color) {
        this.color = color;
    }

    public void setFreeSpace(String freeSpace) {
        this.freeSpace = freeSpace;
    }

    public void setOpenClose(String openClose) {
        this.openClose = openClose;
    }

    public String getFreeSpace() {
        return freeSpace;
    }

    public String getOpenClose() {
        return openClose;
    }

    public Box(String SIZE, String color, String freeSpace, String openClose) {
        this.SIZE = SIZE;
        this.color = color;
        this.freeSpace = freeSpace;
        this.openClose = openClose;
    }

    public String getColor() {
        return color;
    }

    public void info() {
        System.out.println("Коробка имеет следующие характеристики: размер " + SIZE + ";" + " Цвет: " + color + ";" + " в коробке: " + freeSpace + ";" + " Крышка коробки: " + openClose + ".");
        System.out.println();

    }

    public void add(String item) {
        System.out.println("Положим ка предмет: " + item);
        if ((getFreeSpace().equals(pusto)) && (getOpenClose().equals(opened))) {
            System.out.println("в коробку положен предмет " + item);
            setFreeSpace(item);
            System.out.println();
        } else if ((getFreeSpace() != null) && (getOpenClose().equals(opened))) {

            System.out.println("Сначала освободи пространство коробки, чудила");
            System.out.println();


        } else if ((getFreeSpace() != null) && (getOpenClose().equals(closed))) {
            System.out.println("Коробка закрытая и полная, ничего не выйдте мужичок");
            System.out.println();

        } else if ((getFreeSpace().equals(pusto)) && (getOpenClose().equals(closed))) {
            System.out.println("Для начала неплохо бы открыть коробочку");
            System.out.println();

        }
    }



    public void drop(String item) {
        System.out.println("Достанем ка барахлишко в виде: " + item);

        if ((getFreeSpace().equals(item)) && (getOpenClose().equals(opened))) {
            System.out.println("Из коробки вынут предмет " + item);
            setFreeSpace(pusto);
        } else if (!(getFreeSpace().equals(item)) && (getOpenClose().equals(opened))) {
            System.out.println("В коробке размещен " + getFreeSpace() + " и там нет такого предмета как " + item + ". Давай попробуем еще разок..");
            System.out.println();
        } else {
            System.out.println("Прежде чем освободить надо открыть коробку");

        }
        System.out.println();

    }

// коробка пуста. Если она пустая то туда можно сложить предмет. Если коробка полная то от туда можно выбросить предмет

    public static void main(String[] args) {

        Box box = new Box("30 см * 30 см", "Нежно белый", "пусто", "Открытая");
        box.info();
        box.add("Троянский конь");
        box.info();
        box.setColor("Зеленый");
        box.info();
        box.add("Зонтик");
        box.drop("Троянский конь");
        box.info();
        box.add("Зонтик");
        box.info();
        box.drop("Троянский конь");



    }
}




