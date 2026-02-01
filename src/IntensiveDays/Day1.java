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
        // 5. Print number from 1 to 100.
        // -------------------------------------------------------------
        System.out.println("Ingresa un numero ,desde ese numero se contara hasta 100");
        int num5 = scanner.nextInt();


        for(int i = num5; num5 <= 100; num5++){
            System.out.println(num5);
        }

        // -------------------------------------------------------------
        // 6. Imprimir los multiplos de 3 entre 1 y 50
        // -------------------------------------------------------------

        System.out.println("Ingresa  un numero para ver sus multiplos de 3 en 3 ");

        int num6 = scanner.nextInt();

        for(int i = 0; i <= num6;i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }



        // -------------------------------------------------------------
        // 7. imprimir la tabla de multiplicar del numero que ingrese el user.
        // -------------------------------------------------------------

        System.out.println("Ingresa el numero de la tabala de multiplicar que desees  ver ");

        int numTabla = scanner.nextInt();


        System.out.println("Tabla de multiplicar del " + numTabla + ":");

        for(int i = 1;i <= 10; i++){

            int resultado = numTabla * i;

            System.out.println(numTabla+" x "+i+" = "+resultado);
        }


        // -------------------------------------------------------------
        // 8. cuenta regresiva el 10 al 1.
        // -------------------------------------------------------------

        System.out.println("Ingresa el numero para la cuenta regresiva");

        int  num7 = scanner.nextInt();

        for(int i = num7; i>=0; i--)
            System.out.println(i);

        // -------------------------------------------------------------
        // 9. pedir numeros al usuario hasta que ingrese "0".sumar todos
        // -------------------------------------------------------------

        int numero;        // Aquí guardaremos cada número ingresado
        int suma = 0;      // Acumulador donde sumaremos todos los valores

        System.out.println("Ingresa números para sumar. Para terminar, ingresa 0:");

        do {
            numero = scanner.nextInt();  // Pedimos número al usuario
            suma += numero;              // Sumamos cada número ingresado
        } while (numero != 0);           // Cuando el usuario ingresa 0 → se detiene

        System.out.println("La suma total es: " + suma);



        // -------------------------------------------------------------
        // 10. un menu repetitivo
        /*
        1. Saludar
        2. Mostrar hora
        3. Hacer una operación
        0. Salir
        */
        // -------------------------------------------------------------


        int opcion; // variable para almacenar la opción del usuario

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar hora");
            System.out.println("3. Hacer una operación");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt(); // Leemos la opción del usuario

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! Espero que estés teniendo un gran día 😊");
                    break;

                case 2:
                    // Mostramos la hora del sistema
                    System.out.println("La hora actual es: " + java.time.LocalTime.now());
                    break;

                case 3:
                    // Una operación simple (ejemplo: sumar dos números)
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

        } while (opcion != 0);  // 🔁 EL MENÚ SE REPITE HASTA QUE ES 0


        scanner.close();

        System.out.println("\n===== END OF DAY 1 EXERCISES =====");
    }
}
