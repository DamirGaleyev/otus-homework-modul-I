package ru.otus.java.basic.homework12;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("C:\\Users\\User\\Otus\\java-basic-one");
        File[] matches = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String name) {
                return name.endsWith(".txt");
            }
        });

        System.out.println("В корневом каталоге содержатся следующие текстовые файлы: ");
        for (int i = 0; i < matches.length; i++) {
            list.add(matches[i].getName());
            String a = matches[i].getName();
            System.out.println(a);
        }

        System.out.println("Ввести имя файла (включая его расширение) с которым хочет работать пользователь");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        System.out.println("Вы указали имя файла: " + fileName);

        if (list.contains(fileName)) {
            FileInputStream in1 = new FileInputStream(fileName);
            BufferedInputStream inB = new BufferedInputStream(in1);
            try (InputStreamReader in = new InputStreamReader(inB)) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println();
            System.out.println("Введите дополнительную строку в файл ");
            Scanner input2 = new Scanner(System.in);
            String data = input2.nextLine();

            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
                byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
                for (int i = 0; i < buffer.length; i++) {
                    out.write(buffer[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            FileInputStream in2 = new FileInputStream(fileName);
            BufferedInputStream inC = new BufferedInputStream(in2);
            try (InputStreamReader in = new InputStreamReader(inC)) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("Вы ввели некорректное имя файла либо файл отсутствует, попробуйте еще раз пожалуйста");
    }
}