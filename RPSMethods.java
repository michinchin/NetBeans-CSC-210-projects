/*
 * Abigail Chin
 * Anthony Souza
 * CSC 210
 * April 3, 2016
 */
package rpsmethods;

import java.util.Scanner;
import java.util.Random;

public class RPSMethods {

    public static void displayOpeningMessage() {//use void as method with no return type
        System.out.println("We will play a game of Rock-Paper-Scissors. For this game, 0 will scissors, 1 will be rock, and 2 will be paper. ");
        System.out.println("Let's start!");//prints a message to introduce game
    }

    public static int getUserMove() {
        Scanner input = new Scanner(System.in);//creates scanner class to allow user input 
        int user;//creates variable named user for user input
        boolean valid;//valid variable created
        do {//loop that repeatedly asks until valid input
            System.out.println("Enter a number([0] scissors, [1] rock, or [2] paper): ");
            while (!input.hasNextInt()) {//nested loop that will keep responding to invalid input(when input is not a number)
                System.out.println("That is not a number. Please try again.");
                input.next();//waits for input then responds
            }
            user = input.nextInt();//reads input and stores in user variable
            valid = user >= 0 && user <= 2;//defines boolean valid as true when these statements are true

            if (!valid) {//when invalid, prints statement
                System.out.println("That is not a valid answer. Choose a number between 0 and 2 please.");
            }

        } while (!valid);//does loop while invalid

        return user;//returns value of variable user

    }

    public static int getCPUMove() {
        Random rnd = new Random();//creates random class called rnd
        int cpu;//defines variable cpu
        cpu = rnd.nextInt(3);//parameter from 0 to 2 that random can generate and store in cpu
        return cpu;//returns variable cpu result
    }

    public static void determineWinner(int user, int cpu) {//parameters
        if (cpu == 0 && user == 2) {//series of if/else-if statements to determine a winner and print it 
            System.out.println("The computer is scissors. You are paper. You lost.");
        } else if (cpu == 0 && user == 1) {
            System.out.println("The computer is scissors. You are rock. You won.");
        } else if (cpu == 0 && user == 0) {
            System.out.println("The computer is scissors. You are scissors. 'Tis a draw.");
        } else if (cpu == 1 && user == 0) {
            System.out.println("The computer is rock. You are scissors. You lost.");
        } else if (cpu == 1 && user == 1) {
            System.out.println("The computer is rock. You are rock. 'Tis a draw.");
        } else if (cpu == 1 && user == 2) {
            System.out.println("The computer is rock. You are paper. You won.");
        } else if (cpu == 2 && user == 0) {
            System.out.println("The computer is paper. You are scissors. You won.");
        } else if (cpu == 2 && user == 1) {
            System.out.println("The computer is paper. You are rock. You lost.");
        } else if (cpu == 2 && user == 2) {
            System.out.println("The computer is paper. You are paper. 'Tis a draw.");
        }
    }

    public static void main(String[] args) {
        displayOpeningMessage();//executes program in method displayOpeningMessage
        int cpu = getCPUMove();//defines variable cpu and stores result of getCPUMove in cpu
        int user = getUserMove();//defines variable user and stores result of getUserMove in user
        determineWinner(user, cpu);//takes result of programs getCPUMove and getUserMove and puts those numbers into program determineWinner
    }
    //Determining a winner

}
