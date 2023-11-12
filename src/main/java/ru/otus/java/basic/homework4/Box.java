package ru.otus.java.basic.homework4;

public class Box {
    private final String size;
    private String color;
    private String boxСondition;
    private String openClose;
    private static final String PUSTO = "пусто";
    private static final String FULL = "полная";
    private static final String OPENED = "Открытая";
    private static final String CLOSED = "Закрытая";
    private static final String ITEM = null;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBoxСondition(String boxСondition) {
        this.boxСondition = boxСondition;
    }

    public void setOpenClose(String openClose) {
        this.openClose = openClose;
    }

    public String getBoxСondition() {
        return boxСondition;
    }

    public String getOpenClose() {
        return openClose;
    }

    public Box(String size, String color, String boxСondition, String openClose) {
        this.size = size;
        this.color = color;
        this.boxСondition = boxСondition;
        this.openClose = openClose;
    }

    public String getColor() {
        return color;
    }

    public void info() {
        System.out.println("Коробка имеет следующие характеристики: размер " + size + ";" + " Цвет: " + color + ";" + " в коробке: " + boxСondition + ";" + " Крышка коробки: " + openClose + ".");
        System.out.println();

    }

    public void add(String item) {
        System.out.println("Положим ка предмет: " + item);
        if ((getBoxСondition().equals(PUSTO)) && (getOpenClose().equals(OPENED))) {
            System.out.println("в коробку положен предмет " + item);
            setBoxСondition(item);
            System.out.println();
        } else if ((getBoxСondition() != null) && (getOpenClose().equals(OPENED))) {

            System.out.println("Сначала освободи пространство коробки, чудила");
            System.out.println();


        } else if ((getBoxСondition() != null) && (getOpenClose().equals(CLOSED))) {
            System.out.println("Коробка закрытая и полная, ничего не выйдте мужичок");
            System.out.println();

        } else if ((getBoxСondition().equals(PUSTO)) && (getOpenClose().equals(CLOSED))) {
            System.out.println("Для начала неплохо бы открыть коробочку");
            System.out.println();

        }
    }



    public void drop(String item) {
        System.out.println("Достанем ка барахлишко в виде: " + item);

        if ((getBoxСondition().equals(item)) && (getOpenClose().equals(OPENED))) {
            System.out.println("Из коробки вынут предмет " + item);
            setBoxСondition(PUSTO);
        } else if (!(getBoxСondition().equals(item)) && (getOpenClose().equals(OPENED))) {
            System.out.println("В коробке размещен " + getBoxСondition() + " и там нет такого предмета как " + item + ". Давай попробуем еще разок..");
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




