package IntensiveDays;

import java.util.Scanner;

public class Day1 {

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== DAY 1 EXERCISES =====");

        // -------------------------------------------------------------
        // 1. Given a number, determine if it is even or odd.
        // -------------------------------------------------------------
        System.out.print("\nEnter a number to check if it's even or odd: ");
        int num0 = scanner.nextInt();

        if (num0 % 2 == 0) {
            System.out.println("The number " + num0 + " is even.");
        } else {
            System.out.println("The number " + num0 + " is odd.");
        }


        // -------------------------------------------------------------
        // 2. Determine if a number is positive, negative, or zero.
        // -------------------------------------------------------------
        System.out.print("\nEnter a number to check if it's positive, negative, or zero: ");
        int num1 = scanner.nextInt();

        if (num1 > 0) {
            System.out.println("The number " + num1 + " is positive.");
        } else if (num1 < 0) {
            System.out.println("The number " + num1 + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }


        // -------------------------------------------------------------
        // 3. Receive 3 numbers and print the largest.
        // -------------------------------------------------------------
        System.out.print("\nEnter the first number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num4 = scanner.nextInt();

        if (num2 >= num3 && num2 >= num4) {
            System.out.println("The largest number is " + num2);
        } else if (num3 >= num2 && num3 >= num4) {
            System.out.println("The largest number is " + num3);
        } else {
            System.out.println("The largest number is " + num4);
        }


        // -------------------------------------------------------------
        // 4. Enter a number from 1 to 7 and show the corresponding day of the week.
        // -------------------------------------------------------------
        System.out.print("\nEnter a number from 1 to 7 to get the day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid number. Please enter a value from 1 to 7.");
        }

        scanner.close();
        System.out.println("\n===== END OF DAY 1 EXERCISES =====");
    }
}