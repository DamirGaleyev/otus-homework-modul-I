package ru.otus.java.basic.homework1;


import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int result = scanner.nextInt();
        System.out.println("Вы выбрали число " + result);

        if (result == 1) {
            greetings();
        } else if (result == 2) {
            checkSign(1, 2, 3);
        } else if (result == 3) {
            selectColor(10);
        } else if (result == 4) {
            compareNumbers(1, 5);
        } else if (result == 5) {
            addOrSubtractAndPrint(1, 2, true);
        }


    }

        public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

        }



    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        increment = true;
        if (increment) {
            int sum = initValue + delta;
            System.out.println(sum);
        } else {
            int minus = initValue - delta;
            System.out.println(minus);
        }


        }

    }

