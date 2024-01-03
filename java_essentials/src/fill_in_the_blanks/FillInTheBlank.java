package fill_in_the_blanks;
import java.util.Scanner;

public class FillInTheBlank {
    public static void main (String [] args){
        // Ask user for Season of the year
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's create a story!");
        System.out.println("Type an adjective");
        String adjective = scanner.next();

        System.out.println("Type a season of the year");
        String season = scanner.next();

        // ask for whole number (integer)
        System.out.println("Type a number");
        int number = scanner.nextInt();

        scanner.close();
        // Print a story with the blank values
        System.out.println("On a " + adjective +" " + season + " day, I drink a minimum of "
                + number + " cups of coffee.");
    }
}
