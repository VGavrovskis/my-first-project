package lv.acodemy.homework;

public class SecondHomeWork {
    public static void main(String[] args) {
        System.out.println("Task Nr. 1-1.1");
        String[] countries = {"Germany", "Austria", "Belgium", "Denmark", "Estonia", "Finland", "Hungary", "Italy", "Lithuania", "Latvia"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
        System.out.println("Task Nr. 1.2");
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Latvia")) {
                System.out.println("Latvia is my motherland");
            }
        }
        System.out.println("Task Nr. 2");
        String[] sentence = {"Sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "Monday", "rather", "than", "spending", "the", "rest", "of", "the", "week", "debugging", "Monday’s", "code."};
        {
            for (int i = 0; i < sentence.length; i++) {
                System.out.print(sentence[i] + " ");
            }
        }
        System.out.println("\nTask Nr. 3");
        double salary = 9000.2;
        if (salary <= 5000) {
            System.out.println("Your salary is low.");
        } else if (salary < 10000 && salary > 5000){
            System.out.println("Your salary is average.");
        } else if (salary >= 10000) {
            System.out.println("Your salary is high.");
        }
        System.out.println("\nTask Nr. 4");
        int number = -1;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        }
    }
}



