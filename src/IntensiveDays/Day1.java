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

        System.out.println("===== DAY 1 EXERCISES-LOOPS =====");

        // -------------------------------------------------------------
        // 5. Print numbers from 1 to 100.
        // -------------------------------------------------------------
        System.out.println("Ingresa un numero ,desde ese numero se contara hasta 100");
        int num5 = scanner.nextInt();


        for(int i = num5; num5 <= 100; num5++){
            System.out.println(num5);
        }

        // -------------------------------------------------------------
        // 6. Print the multiples of 3 between 1 and 50.
        // -------------------------------------------------------------

        System.out.println("Ingresa  un numero para ver sus multiplos de 3 en 3 ");

        int num6 = scanner.nextInt();

        for(int i = 0; i <= num6;i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }



        // -------------------------------------------------------------
        // 7. print the multiplication table for the number entered by the user.
        // -------------------------------------------------------------

        System.out.println("Ingresa el numero de la tabala de multiplicar que desees  ver ");

        int numTabla = scanner.nextInt();


        System.out.println("Tabla de multiplicar del " + numTabla + ":");

        for(int i = 1;i <= 10; i++){

            int resultado = numTabla * i;

            System.out.println(numTabla+" x "+i+" = "+resultado);
        }


        // -------------------------------------------------------------
        // 8. countdown from the number entered by the user
        // -------------------------------------------------------------

        System.out.println("Ingresa el numero para la cuenta regresiva");

        int  num7 = scanner.nextInt();

        for(int i = num7; i>=0; i--)
            System.out.println(i);

        // -------------------------------------------------------------
        // 9. Ask the user to enter numbers until they enter “0.” Add them all up.
        // -------------------------------------------------------------

        int numero;        // Here we will store each number entered.
        int suma = 0;      // Accumulator where we will add all the values.

        System.out.println("Ingresa números para sumar. Para terminar, ingresa 0:");

        do {
            numero = scanner.nextInt();  // We ask the user for their number
            suma += numero;              // We add each number entered
        } while (numero != 0);           //  When the user enters 0 → it stops

        System.out.println("La suma total es: " + suma);



        // -------------------------------------------------------------
        //  10. A repetitive menu
        /*
        1. Greet
        2. Show time
        3. Perform an operation
        0. Exit
        */
        // -------------------------------------------------------------


        int opcion; // variable to store the user's choice

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar hora");
            System.out.println("3. Hacer una operación");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt(); // We read the user's choice

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! Espero que estés teniendo un gran día 😊");
                    break;

                case 2:
                    //  We display the system time
                    System.out.println("La hora actual es: " + java.time.LocalTime.now());
                    break;

                case 3:
                    // A simple operation (example: adding two numbers)
                    System.out.print("Ingresa el primer número: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingresa el segundo número: ");
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;

                case 0:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }

        } while (opcion != 0);  // THE MENU IS REPEATED UNTIL IT IS 0


        scanner.close();

        System.out.println("\n===== END OF DAY 1 EXERCISES =====");
    }
}
