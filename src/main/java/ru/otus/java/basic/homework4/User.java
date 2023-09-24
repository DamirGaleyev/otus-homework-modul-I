package ru.otus.java.basic.homework4;

public class User {
    private String UserName;
    private int yearOfBirth;
    private String emailAddress;

    public User(String userName, int yearOfBirth, String emailAddress) {
        UserName = userName;
        this.yearOfBirth = yearOfBirth;
        this.emailAddress = emailAddress;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return UserName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
