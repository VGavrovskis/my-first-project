package lv.acodemy.homework;

public class FirstHomeWork {
    public static void main(String[] args) {
        int circleDiameter = 10;
        int circleRadius = 5;
        double pi = 3.14;

        System.out.println("Circle S = " + circleRadius * circleRadius * pi);
        System.out.println("Circle S = " + circleDiameter * circleDiameter / 4 * pi);

        byte monthInYear = 12;
        int daysInYear = 365;
        System.out.printf("in Year month = " + monthInYear +" " + "and days = " + daysInYear);

        short num1 = 10;
        short num2 = -10;
        System.out.println("\n num1 = " + num1 + "\n num2 = " + num2);

        char firstNameLetter = 'V';
        char firstLSurnameLetter = 'G';
        String initialNameSurname = firstNameLetter + " " + firstLSurnameLetter;
        System.out.println(initialNameSurname);

        String name = "Vjaceslavs";
        String hobby = "snowboarding, swimming, hiking";
        String job = "project engineer";
        String futureJob = "programmer";
        byte jobYear = 10;

        System.out.printf("My name is %s. I like %s.\nAt the moment I'm a %s for about %d years.\nNow is the time for change and I want to be a better %s!", name, hobby, job, jobYear, futureJob);
    }
}

