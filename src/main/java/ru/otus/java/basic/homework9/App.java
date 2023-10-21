package ru.otus.java.basic.homework9;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        //1 часть ДЗ

        int min = 1;
        int max = 10;
        System.out.println(getFilledArrayList(min, max));

        ArrayList<Integer> list = getFilledArrayList(min, max);
        System.out.println(getSumArrayList(list));

        int number = 9;
        System.out.println(fillArrayNumber(number, list));

        ArrayList<Integer> list2 = getFilledArrayList(min, max);

        int score = 1;
        System.out.println(sumArrayNumber(score, list2));


        //2  часть ДЗ

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Dan", 50));
        employees.add(new Employee("Misha", 20));
        employees.add(new Employee("Evgen", 19));
        employees.add(new Employee("Mark", 18));
        employees.add(new Employee("Stas", 170));

        System.out.println(getListEmployees(employees));
        System.out.println(getListOldEmployees(employees, 30));
        System.out.println(isListAverageAgeEmployees(employees, 33));
        System.out.println(getListYoungestEmployees(employees));
    }

    private static ArrayList<Integer> sumArrayNumber(int score, ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int a = arrayList.get(i) + score;
            arrayList.set(i, a);
        }
        return arrayList;
    }

    private static ArrayList<Integer> fillArrayNumber(int number, ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, number);
        }
        return arrayList;
    }

    private static int getSumArrayList(ArrayList<Integer> list) {
        int sum = 0;
        for (int a : list) {
            if (a > 5) {
                sum += a;
            }
        }
        return sum;
    }


    private static ArrayList<Integer> getFilledArrayList(int min, int max) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            integers.add(i);
        }
        return integers;
    }


    private static Employee getListYoungestEmployees(ArrayList<Employee> employees) {
        int youngEmployee = employees.get(0).getAge();
        for (Employee employee : employees) {
            if (youngEmployee > employee.getAge()) {
                youngEmployee = employee.getAge();
            }
        }
        for (Employee employee : employees) {
            if (employee.getAge() == youngEmployee) {
            return employee;
        }
    }
        return null;
    }

    private static boolean isListAverageAgeEmployees(ArrayList<Employee> employees, int avgAge) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getAge();
        }
        int avgAge2 = sum / employees.size();
        if (avgAge2 > avgAge) {
            return true;
        }
        return false;
    }

    // 1 вариант
    private static ArrayList<Employee> getListOldEmployees(ArrayList<Employee> employees, int age) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= age) {
                list.add(employee);
            }
        }
        return list;
    }
    // 2 вариант
//    private static ArrayList<Employee> getListOldEmployees(ArrayList<Employee> employees, int age) {
//        ArrayList<Employee> list = new ArrayList<>();
//        for (int j = 0; j < employees.size(); j++) {
//            Employee imp = employees.get(age);
//            if (imp.getAge() >= age) {
//                list.add(imp);
//            }
//        }
//        return list;
//    }

    // 1 вариант
    private static ArrayList<String> getListEmployees(ArrayList<Employee> employees) {
        ArrayList<String> list = new ArrayList<>();
        for (Employee employee : employees) {
            list.add(employee.getName());
        }
        return list;
    }
    // 2 вариант
//    private static ArrayList<String> getListEmployees(ArrayList<Employees> employees) {
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < employees.size(); i++) {
//            list.add(employees.get(i).getName());
//        }
//        return list;
//    }

    // 3 вариант

//    private static ArrayList<String> getListEmployees(ArrayList<Employees> employees) {
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < employees.size(); i++) {
//            Employees employees1 = employees.get(i);
//            String name = employees1.getName();
//            list.add(name);
//        }
//        return list;
//    }
}





