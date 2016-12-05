/*
 * Abigail Chin
 * Anthony Souza
 * CSC 210
 * March 13, 2016
 */
package arrayoperations;

import java.util.Random;

/**
 *
 * @author Abigail
 */
public class ArrayOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] x = new int[10000];//creates array of ints size 10,000

        for (int i = 0; i < x.length; i++) {
            x[i] = rnd.nextInt(201);//finds random number between 0 and 200--fills array with numbers
        }
        int sum = 0;//initializes variable sum
        for (int i : x) {//for-each loop where (type variable: collection)
            sum += i;//or sum=sum+i
        }
        System.out.println("The Sum is: " + sum);

        double avg = 0;//need decimal points rather than whole number
        for (int i = 0; i < x.length; i++) {
            avg = sum / 10000.;//period turns answer into double
        }
        System.out.println("The Average is: " + avg);

        int min = x[0];
        int idx = 0;//variable idx is the position in the array of where min is at
        for (int i = 1; i < x.length; i++) {
            if (min > x[i]) {//if the value is less than the random number, then print value
                min = x[i];//loops so it only prints the number that is the least in array
                idx = i;
            }
        }
        System.out.println("The minimum value is: " + min + " and its index is " + idx);

        int max = x[0];
        int idxm = 0;//variable idxm is the position in the array of where max is at
        for (int i = 1; i < x.length; i++) {
            if (max < x[i]) {//if the value is greater than the random number, then print value
                max = x[i];//loops so it only prints the greatest number in array
                idxm = i;
            }
        }
        System.out.println("The maximum value is: " + max + " and its index is " + idxm);

        int odd = 0;//initializes odd variable
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {//when this is true, adds one to store in odd variable
                odd++;
            }
        }
        System.out.println("This array contains " + odd + " odd numbers");

        int even = 0;//initializes even variable
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {//when this is true, adds one to store in even variable
                even++;
            }
        }
        System.out.println("This array contains " + even + " even numbers");

    }

}
