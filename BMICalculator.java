/*
 * Abigail Chin
 * CSC 210
 * Anthony Souza
 * February 19, 2016
 */
package bmicalculator;

import java.util.Scanner;

/**
 *
 * @author Abigail
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Please enter your full name:");
        name = input.nextLine();//using nextLine allows for there to be a space--to enter the full name

        int height;
        System.out.println("What is your height(in inches)?");
        height = input.nextInt();//integer=whole positive number 

        double weight;
        System.out.println("What is your weight(in pounds)?");
        weight = input.nextDouble();//defining the type to be a double allows for decimals

        System.out.println("Name: " + name);
        if (height % 12 == 0) { //if there is no remainder, there's no need for inches
            System.out.println("Height: " + (height / 12) + "ft");
        } else if (height % 12 > 0) { //if there is a remainder, we can print that in inches
            System.out.println("Height: " + (height / 12) + " ft, " + (height % 12) + " inches");
        }
        System.out.println("Weight: " + weight + " lbs");

        double BMI;
        BMI = ((weight * 703) / (height * height));//must multiply height by height because there is no h^2 and must place precedence for top and bottom functions
        if (BMI <= 18.5) {
            System.out.println("BMI: Underweight");//if the number is less than 18.5, the test subject is underweight
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI: Normal");//both statements(>=18.5 and <=24.9) must be true in order for the "normal" to print
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("BMI: Overweight");//again, both statements must be true to print
        } else {
            System.out.println("BMI: Obese");//if the subject is not any of the above, the subject has to be obese

        }

    }

}
