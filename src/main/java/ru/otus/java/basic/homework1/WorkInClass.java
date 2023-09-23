package ru.otus.java.basic.homework1;

import java.util.Scanner;

public class WorkInClass {
    public static void main(String[] args) {
        ruletcaHuman();


    }

    public static void ruletcaHuman() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int aiNumber = (int) (Math.random() * 10 + 1);
            int answer = scanner.nextInt();
            if (aiNumber == answer) {
                System.out.println("Winner");
                break;
            } else if (aiNumber > answer) {
                System.out.println("Loser, because you anser is less aiNumber");
            } else
                System.out.println("Loser, because your answer is more than aiNumber");

        }
    }


    public static void checkWorkCycle() {
        int min = 1;
        int max = 10;
        Scanner scanner = new Scanner(System.in);
        int answer;
        while (true) {
            while (true) {
                System.out.println("Введи число от " + min + " до " + max);
                answer = scanner.nextInt();
                System.out.println("Вы ввели число: " + answer);
                if (answer < min || answer > max && answer != 100) {
                    System.out.println("Пожалуйста введите число из диапазона от " + min + " до " + max);
                } else
                    break;

            }
            System.out.println("Давай ка еще разок тупорылй мудила");
            if (answer >= min && answer <= max) {
                System.out.println("Мы закончили на блоке if и сейчас по брейку выйдем из программы");
                break;
            } else if (answer == 100) {
                System.out.println("Ура, дошло баля баля баля");
                break;
            }
        }
    }
}
