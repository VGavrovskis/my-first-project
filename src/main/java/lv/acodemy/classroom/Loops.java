package lv.acodemy.classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*

        for(int i = 0; i < 10; i++) {
        // define counter;
        // condition
        // increment
        }
            */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        //numbers [0] = 1;
        //numbers [1] = 2;
        //numbers [2] = 3;
        // ... numbers [9] = 10;
        // 10 < 10

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("======");
        //numbers [0];
        //numbers [1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("======");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("======");

        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("======//======");
        // create string array with 10 names
        // Print all names using for & for each

        String[] names = {"name1", "name2", "name3", "name4", "name5", "name6", "name7"};
        {
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals("name4")) {
                } else {
                    System.out.println(names[i]);
                }
            }


            System.out.println("======//======");
            for (String name : names) {
                System.out.println(name);
            }

            // do, do while

            /*
            do {
            // code to be executed
            } (while is true)
             */

            int i = 0;
            do {
                System.out.println(i);
                i++;
            } while (i <= 10);

            int b = 0;
            while (b <= 10); {
                System.out.println(b);
                b++;
            }
            int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] emptyArray = new int[arrayOfNum.length];

            //move number from arrayOfNum to empltyArray using loop
            //emptyArray[0] = arrayOfNum[]
            for (int j = 0; j < arrayOfNum.length; j++) {
                emptyArray[j] = arrayOfNum[j];

                //0
                // emptyArray [0] = 0;
                // emptyArray [0] = 1;

                //1
                // emptyArray [1] = 0;
                // emptyArray [1] = 2;

                System.out.println(Arrays.toString(emptyArray));
            }
        }
    }
}


