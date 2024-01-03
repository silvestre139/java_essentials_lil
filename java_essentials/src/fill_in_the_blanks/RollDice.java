package fill_in_the_blanks;

import java.util.Random;

public class RollDice {
    public static void main (String [] args) {
        // TODO
        // travel entire game board of 20 spaces within 5 die rolls
        // generate random number between 1 and 6 to represent die roll
        // tell player which game space they are on and how many more spaces they have to go to win
        // repeat four times (five rolls total)
        // if the player advances exactly 20 spaces within five die rolls they win else they lose
        // output results of the game ()


        // Rolling the die
        Random random = new Random();
        int spaces = 20;
        int currentPosition = 0;

        for (int i=0; i < 5; i++){
            int die = random.nextInt(6) + 1;
            currentPosition += die;

            if (currentPosition < spaces) {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + " You are now on space " + (currentPosition) + " and have " + (spaces - currentPosition) + " to go.");
            }
            else if(currentPosition > spaces){
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + " You are now on space " + (currentPosition) + ". We found a bug.");
            }
            else if(currentPosition == spaces) {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + " You are now on space " + (currentPosition) + ". Congrats you win!");
            }
        }






    }

}

