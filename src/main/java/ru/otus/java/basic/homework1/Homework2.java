package ru.otus.java.basic.homework1;

import java.util.Arrays;

public class Homework2 {


    public static void main(String[] args) {
//        numberStringMethod(1, "Hello man");
//        numberArrayMethod(10, 5, 4, 15, 25);
//        fillArray(5, 0, 5, 0, 0, 0, 0);
//        fillArray2(6, new int[]{0, 9, 1, 1, 1, 1});
        sumHalfArray(new int[]{2, 3, 3, 3, 3, 5,});

    }

    public static void numberStringMethod(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    public static void numberArrayMethod(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArray(int a, int... array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray2(int a, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += a;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void sumHalfArray(int[] array) {
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < array.length / 2; i++) {
            sum += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sum2 += array[i];

        }
        if (sum > sum2) {
            System.out.println("Сумма элементов первой половины массива больше суммы элементов второй половины массива");
        } else {
            System.out.println("Сумма элементов второй половины массива больше суммы элементов первой половины массива");
        }

    }
}






