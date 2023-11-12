package ru.otus.java.basic.homework14;
import java.util.Arrays;

public class Multithreading {
    public synchronized void fillArrayValue(double[] array) {
        long t = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(array[i]) * Math.sin(array[i] * 0.2) * Math.cos(array[i] / 1.2);
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println("поток который обработал весь массив");
    }

    public synchronized void fillArrayValueOneThread(double[] array) {
        long t = System.currentTimeMillis();
        for (int i = 0; i < array.length /4; i++) {
            array[i] = 1.14 * Math.cos(array[i]) * Math.sin(array[i] * 0.2) * Math.cos(array[i] / 1.2);
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println("поток который обработал c 0 до 1/4 части массива");
        System.out.println();

    }

    public synchronized void fillArrayValueTwoThread(double[] array) {
        long t = System.currentTimeMillis();
        for (int i = array.length / 4; i < array.length / 2; i++) {
            array[i] = 1.14 * Math.cos(array[i]) * Math.sin(array[i] * 0.2) * Math.cos(array[i] / 1.2);
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println("поток который обработал 1/4 до 1/2 части массива");
        System.out.println();

    }

    public synchronized void fillArrayValueThreeThread(double[] array) {
        long t = System.currentTimeMillis();
        for (int i = array.length / 2; i < array.length * 3/4; i++) {
            array[i] = 1.14 * Math.cos(array[i]) * Math.sin(array[i] * 0.2) * Math.cos(array[i] / 1.2);
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println("поток который обработал 1/2 до 3/4 части массива");
        System.out.println();

    }

    public synchronized void fillArrayValueFourThread(double[] array) {
        long t = System.currentTimeMillis();
        for (int i = array.length * 3/4; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(array[i]) * Math.sin(array[i] * 0.2) * Math.cos(array[i] / 1.2);
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println("поток который обработал 3/4 до конца массива");
    }


    public static void main(String[] args) throws InterruptedException {
        double[] array = new double[10000];
        double[] array2 = new double[10000];
        Arrays.fill(array, 1.0);
        Arrays.fill(array2, 1.0);
        Multithreading multithreading = new Multithreading();
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                multithreading.fillArrayValue(array);
            }
        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                multithreading.fillArrayValueOneThread(array2);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                multithreading.fillArrayValueTwoThread(array2);
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                multithreading.fillArrayValueThreeThread(array2);
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                multithreading.fillArrayValueFourThread(array2);
            }
        });
        t0.start();
        t0.join();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        System.out.println(Arrays.toString(array2));

    }
}