package ru.otus.java.basic.homework13.Server;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server  {
    private static Socket clietnSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;
    private static String mathematicalOperation;

    public static void main(String[] args) throws RuntimeException {
        mathematicalOperation = "Вам доступны следующие мамематические операции: сложение(+), вычитание (-), умножение (*), деление (/)";
        int result = 0;
        try {
            try {
                server = new ServerSocket(4004);
                System.out.println("Сервер запущен!");
                clietnSocket = server.accept();

                try {
                    in = new BufferedReader(new InputStreamReader(clietnSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clietnSocket.getOutputStream()));
                    while (true) {
                        out.write(mathematicalOperation + "\n");
                        out.flush();

                        String firstNumber = in.readLine();
                        System.out.println(firstNumber);
                        int one = Integer.parseInt(firstNumber);

                        String secondNumber = in.readLine();
                        System.out.println(secondNumber);
                        int two = Integer.parseInt(secondNumber);

                        String mathOperation = in.readLine();
                        System.out.println(mathOperation);

                        if (mathOperation.equals("+")) {
                            result = one + two;
                        }
                        if (mathOperation.equals("-")) {
                            result = one - two;
                        }
                        if (mathOperation.equals("*")) {
                            result = one * two;
                        }
                        if (mathOperation.equals("/")) {
                            result = one / two;
                        }

                        out.write("Привет, это Сервер! Результат вычислений равен  " + result + "\n");
                        out.flush();

                        String repeat = in.readLine();
                        System.out.println(repeat);
                        if (repeat.equals("Нет")) {
                            break;
                        }
                    }

                } finally {
                    clietnSocket.close();
                    System.out.println("Сокет для общения закрыт");

                    in.close();
                    out.close();
                }
            } finally {
                System.out.println("Сервер закрыт");
                server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}