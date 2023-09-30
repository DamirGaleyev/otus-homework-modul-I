package ru.otus.java.basic.homework6;

public class Plate {
    private final int FOODMAX;

        private int food;
    private boolean empty;

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate " + FOODMAX + " " + food;
    }

    public Plate(int FOODMAX, int food) {
        this.FOODMAX = FOODMAX;
        this.food = food;

    }

    public boolean downFood(int mill) {
        if ((food - mill) >= 0) {
            food -= mill;
            return true;
        }
        food = 0;
        return false;
    }


    public void addFood(FoodPackage foodPackage) {
        if (foodPackage.isEmpty()){
            System.out.println("Тут нечего насыпать");
            return;
        }
        if ((foodPackage.getCapacity() >= FOODMAX) && (FOODMAX == food)) {
            System.out.println("Миска и так полная");
            return;
        }
        if ((foodPackage.getCapacity() <= FOODMAX) && (FOODMAX > food) && ((food + foodPackage.getCapacity()) <= FOODMAX)) {
            food += foodPackage.transfer();
            System.out.println("Миска заполнена на " + food + " миллиграм");
            return;

        } else if (food + foodPackage.getCapacity() > FOODMAX) {
            food += foodPackage.transfer();
            food = FOODMAX;
            System.out.println("Добавлено " + FOODMAX + " миллиграмм. Остальное дожрут куры");

        }
    }
}


