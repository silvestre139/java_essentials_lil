package fill_in_the_blanks;

import java.util.Scanner;

public class ChangeForDollar {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

//        1 cent
        System.out.println("Provided number of pennies");
        int pennies = scanner.nextInt();

//        5 cents
        System.out.println("Provided number of nickels");
        int nickels = scanner.nextInt();

        System.out.println("Provided number of dimes");
//        # 10 cents
        int dimes = scanner.nextInt();

//        25 cents
        System.out.println("Provided number of quarters");
        int quarters = scanner.nextInt();

        //If is exact $1 dollar you won
        double results= (pennies + (nickels * 5) + (dimes *10) + (quarters *25)) / 100.0;
        double dollar = 1.00;
        if (results == dollar) {
            System.out.println("YAy that is exactly $" + String.format("%.2f",(results)) + "! You wont");
        }
        else if ( results < dollar) {
            System.out.println("You are " + String.format("%.2f",(results - dollar)) + " Under");
        }
        else {
            System.out.println("You are " + String.format("%.2f",(results - dollar)) + " over");
        }

//        else how much they were over or how much they were under
    }
}
