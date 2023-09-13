import java.util.Scanner;

public class Medthod2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        while (count <= 0) {
            System.out.println("Choose option");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");

            int option = input.nextInt();

            if (option == 0) {
                count++;
            }

            else if (option == 1) {
                System.out.print("Enter Farenheit :");
                int fahrenheit = input.nextInt();

                System.out.println(celsius(fahrenheit) + " Celsius");
            }

            else if (option == 2) {
                System.out.print("Enter Celsius :");
                int celsius = input.nextInt();

                System.out.println(fahrenheit(celsius) + " Farenheit");
            }
        }

        System.out.println("Exit !!! ");

    }

    public static int celsius(int fahrenheit) {
        int result = (fahrenheit - 32) * 5 / 9;

        return result;
    }

    public static int fahrenheit(int celsius) {
        int result = (9 * celsius / 5) + 32;

        return result;
    }
}
