package ru.otus.java.basic.homework8;

public class App {
    public static void main(String[] args) {

        String[][] fruits = new String[4][4];
        fruits[0][0] = "0";
        fruits[0][1] = "1";
        fruits[0][2] = "2";
        fruits[0][3] = "3";
        fruits[1][0] = "4";
        fruits[1][1] = "5";
        fruits[1][2] = "6";
        fruits[1][3] = "7";
        fruits[2][0] = "8";
        fruits[2][1] = "9";
        fruits[2][2] = "10";
        fruits[2][3] = "11";
        fruits[3][0] = "12";
        fruits[3][1] = "13";
        fruits[3][2] = "14";
        fruits[3][3] = "15";
        try {
            System.out.println(getSum(fruits));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int getSum(String[][] fruits) {
        if ((fruits.length != 4) || (fruits[0].length != 4) || (fruits[1].length != 4) || (fruits[2].length != 4) || (fruits[3].length != 4)) {
            throw new AppArraySizeException("Длина массива не соответствует запрашиваемой длинне массива =4*4");
        }
        int sum = 0;
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {
                try {
                    sum += Integer.parseInt(fruits[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("В ячейке [%d][%d] находится некорректное значение '%s'".formatted(i, j, fruits[i][j]));
                }
            }
        }
        return sum;
    }
}
