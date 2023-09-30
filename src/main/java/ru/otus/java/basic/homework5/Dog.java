package ru.otus.java.basic.homework5;

public class Dog extends Animal {

    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }

    @Override
    public int swim(int distance1) {
        distance = distance1;
        if (endurance >= distance * 2) {
            timeAction = distance / swimmingSpeed;
            endurance -= (distance * 2);
            System.out.println(name + " проплыла дистанцию в " + distance + " метров " + "за " + timeAction + " секунд");
            return timeAction;
        }
        System.out.println("Животное устало");
        return timeAction = -1;
    }

}


