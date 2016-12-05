/*
 *Abigail Chin
 *Anthony Souza
 *CSC 210
 *February 28, 2016
 */
package rock.paper.scissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Abigail
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creates scanner class to allow user input
        int choice;//stores user input as int
        int round = 0;//defines initial value of number of rounds
        int comp = 0;//defines initial value of number of computer wins
        int user = 0;//defines initial value of number of user wins
        while (round < 3) {//while loop that repeatedly asks user 3 times to asnwer
            System.out.println("Pick a number from 0 to 2 (Rock(1), Paper(2), or Scissors(0)):");//prompts user for choice of rps
            choice = input.nextInt();//integer = whole number
            Random rnd = new Random();//declares and initializes random object 
            int num = rnd.nextInt(3);//generates number between 0 and 2

            if (num == 0 && choice == 2) {
                System.out.println("The computer is scissors. You are paper. You lost.");
                comp++;//counts computer won one round
                round++;//counts one round played
            } else if (num == 0 && choice == 1) {
                System.out.println("The computer is scissors. You are rock. You won.");
                user++;//counts user won one round
                round++;//counts one round played
            } else if (num == 0 && choice == 0) {
                System.out.println("The computer is scissors. You are scissors. 'Tis a draw.");

            } else if (num == 1 && choice == 0) {
                System.out.println("The computer is rock. You are scissors. You lost.");
                comp++;//counts computer won one round
                round++;//counts one round played
            } else if (num == 1 && choice == 1) {
                System.out.println("The computer is rock. You are rock. 'Tis a draw.");
            } else if (num == 1 && choice == 2) {
                System.out.println("The computer is rock. You are paper. You won.");
                user++;//counts user won one round
                round++;//counts one round played

            } else if (num == 2 && choice == 0) {
                System.out.println("The computer is paper. You are scissors. You won.");
                user++;//counts user won one round
                round++;//counts one round played
            } else if (num == 2 && choice == 1) {
                System.out.println("The computer is paper. You are rock. You lost.");
                comp++;//counts computer won one round
                round++;//counts one round played
            } else if (num == 2 && choice == 2) {
                System.out.println("The computer is paper. You are paper. 'Tis a draw.");//if a draw, doesn't count in number of rounds won
            } else {
                System.out.println("Invalid entry");//if user inputs a number below 0 or above 2, prints invalid
            }

        }
        if (comp >= 2) {//ends loop if computer wins 3 or 2 out of 3
            System.out.println("Computer won best of 3.");
        } else {
            System.out.println("You won best of 3.");//ends loops if you win 3 or 2 out of 3

        }
    }
}
