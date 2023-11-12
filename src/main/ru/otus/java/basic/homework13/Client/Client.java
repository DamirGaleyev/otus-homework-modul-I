package ru.otus.java.basic.homework13.Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;
    private static String serverMessage;

    public static void main(String[] args) {
        try {
            try {
                clientSocket = new Socket("localhost", 4004);
                reader = new BufferedReader(new InputStreamReader(System.in));
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                while (true) {
                    serverMessage = in.readLine();
                    System.out.println(serverMessage);
                    System.out.println();
                    System.out.println("Введите первое число");
                    Scanner scanner = new Scanner(System.in);
                    int firstNumber = scanner.nextInt();
                    out.write(firstNumber + "\n");
                    out.flush();
                    System.out.println("Введите второе число");
                    int secondNumber = scanner.nextInt();
                    out.write(secondNumber + "\n");
                    out.flush();
                    System.out.println("Введите математическую операцию: +, -, *, /");
                    String mathOperation = scanner.next();
                    System.out.println(mathOperation);
                    out.write(mathOperation + "\n");
                    out.flush();

                    String serverWord = in.readLine();
                    System.out.println(serverWord);

                    boolean flag = true;
                    while (flag) {
                        System.out.println("еще раз? : Да / Нет");
                        String word = reader.readLine();
                        if (word.equals("Нет")) {
                            out.write(word + "\n");
                            out.flush();
                            return;
                        } else if (word.equals("Да")) {
                            out.write(word + "\n");
                            out.flush();
                            flag = false;
                        } else {
                            System.out.println("Некорректная команда");
                        }
                    }
                }

            } finally {
                System.out.println("Клиент был закрыт...");
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
