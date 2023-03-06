package lv.acodemy.homework;

import java.io.PrintStream;

public class FirstHomeWork {
    public static void main(String[] args) {
        int CircleDiameter = 10;
        int CircleRadius = 5;
        double pi = 3.14;

        System.out.println("Circle S = " + CircleRadius * CircleRadius * pi);
        System.out.println("Circle S = " + CircleDiameter * CircleDiameter / 4 * pi);

        byte MonthInYear = 12;
        int DaysInYear = 365;
        PrintStream printf = System.out.printf("in Year month = " + MonthInYear +" " + "and days = " + DaysInYear);

        short num1 = 10;
        short num2 = -10;
        System.out.println("\n num1 = " + num1 + "\n num2 = " + num2);

        char firstNameLetter = 'V';
        char firstLSurnameLetter = 'G';
        String initialNameSurname = firstNameLetter + "" + firstLSurnameLetter;
        System.out.println(initialNameSurname);

        String name = "Vjaceslavs";
        String hobby = "snowboarding, swimming, hiking";
        String job = "project engineer";
        String futureJob = "programmer";
        byte jobYear = 10;

        System.out.printf("My name is %s. I like %s.\nAt the moment I'm a %s for about %d years.\nNow is the time for change and I want to be a better %s!", name, hobby, job, jobYear, futureJob);
    }

}

