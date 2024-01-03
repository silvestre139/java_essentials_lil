package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
//        System.out.println("Hello World! first class");
//      1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        //Specify the expected value from the input
        hours = scanner.nextInt();

//      2. Get the hourly rate
        double payRate = 0;
        System.out.println("How much is your pay rate?");

        //Specify the expected value from the input
        payRate = scanner.nextDouble();

        // Close scanner
        scanner.close();

//      3. Multiply hours and pay rate
        double grossPay = hours * payRate;

//        4. Display result
        System.out.println("Gross Pay: " + grossPay);
    }

}

