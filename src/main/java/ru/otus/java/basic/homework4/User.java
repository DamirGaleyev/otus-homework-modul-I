package ru.otus.java.basic.homework4;

public class User {
    private String userName;
    private int yearOfBirth;
    private String emailAddress;

    public User(String userName, int yearOfBirth, String emailAddress) {
        this.userName = userName;
        this.yearOfBirth = yearOfBirth;
        this.emailAddress = emailAddress;
    }

    public static void userInformation(User[] users) {

        for (int i = 0; i < users.length; i++) {

            System.out.println("ФИО: " + users[i].userName + "\n" + "Год рождения: " + users[i].yearOfBirth + "\n" + "e-mail: " + users[i].emailAddress + "\n");
        }
    }

    public static void getAge(User[] users) {
        int userAge = 0;
        int thisYear = 2023;
        for (int i = 0; i < users.length; i++) {
            userAge = thisYear - users[i].yearOfBirth;
            System.out.println("ФИО: " + users[i].userName + ", " + "возраст " + userAge + ".");
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
