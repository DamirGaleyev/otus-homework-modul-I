package ru.otus.java.basic.homework5;

public abstract class Animal {
    String name;
    int runningSpeed;
    int swimmingSpeed;
    int endurance;
    int distance;
    int timeAction;

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setTimeAction(int timeAction) {
        this.timeAction = timeAction;
    }


    public int getTimeAction() {
        System.out.println(timeAction);
        return timeAction;
    }

    public void print() {
        System.out.println(name + " пробежала дистанцию в " + distance + " метров " + "за " + timeAction + " секунд");
    }

    public int getDistance() {
        return distance;
    }


    @Override
    public String toString() {
        return "Животное пробежало дистанцию за " + timeAction + " секунд";
    }


    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;

    }

    public int run(int distance1) {
        distance = distance1;
        if (endurance >= distance) {
            timeAction = distance / runningSpeed;
            endurance -= distance;
            System.out.println(name + " пробежала дистанцию в " + distance + " метров " + "за " + timeAction + " секунд");
            return timeAction;
        }
        System.out.println("Животное устало");
        return timeAction = -1;
    }

    public abstract int swim(int distance);

    public void info() {
        if (endurance <= 10) {
            System.out.println("Выносливость " + name + " " + endurance + " условных единиц.");
        } else {
            System.out.println("Выносливость " + name + " " + endurance + " условных единиц.");
        }
    }

}