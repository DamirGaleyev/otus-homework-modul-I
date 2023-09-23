package ru.otus.java.basic.homework1;

public class Homework3 {
    public static void main(String[] args) {
//        sumPositiveElements(1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5);  // 1 пункт ДЗ
//        draw2D(5);                                                  // 2 пункт ДЗ
        int[][] array = {{1, 2, 3, 4}, {1, 2, 3, 4}, {3, 5, 5, 6}, {4, 6, 7, 8}};  // 3 пункт ДЗ
//        touchingLine(array);

        int maxValue = findMax(array); // 4 пункт ДЗ
        System.out.println(maxValue);

        int sum = sumSecondLine(array); // 5 пункт ДЗ
        System.out.println(sum);



//        char[][] array = new char[5][5];
//        fill2DArray(array, '0');
//        print2DArray(array);
    }


    public static void sumPositiveElements(int... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

//    public static void draw2D(int size) {
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }

    public static void fill2DArray(char[][] arr, char initialValue) {
        for (int i = 0; i < arr.length; i++) {        // обходим каждый элемент массива
            for (int j = 0; j < arr[i].length; j++) { // обходим каждый элемент массива
                arr[i][j] = initialValue;             // заполняем каждый элемент массива значением (тут initialValue)

            }

        }

    }

    private static void print2DArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); // Печатаем первую строку элементов двумерного массива по Х и У
            }
            System.out.println();                   // Переходим на следующую строку и печатаем вторую строку по Х и У и т.п.
        }
        System.out.println();

    }

    public static void touchingLine(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {        // обходим каждый элемент массива
            for (int j = 0; j < arr[i].length; j++) { // обходим каждый элемент массива
                if (Math.abs(j - i) < 1) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    public static int sumSecondLine(int[][] array) {
        int sum = 0;
                if (array.length > 1 && array[1].length > 0) {
            for (int j = 0; j < array[1].length; j++) {
                sum += array[1][j];
            }
            return sum;
        }
        return -1;
    }
}
