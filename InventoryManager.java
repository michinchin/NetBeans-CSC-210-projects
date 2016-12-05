/*Abigail Chin
 Anthony Souza
 CSC 210
 May 13, 2016
 */
package inventorymanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Abigail
 */
public class InventoryManager {

    public static void printInventory(Item[] x) {//method to print entire inventory
        System.out.printf("%-15s%-15s%-15s\n", "Name", "Quantity", "Price per unit");//use s for string, prints header
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i].toString());//pass toString() method into number in array
        }

    }

    public static void checkLowInventory(Item[] x) {//method to check for items with quantity less than 5
        int notLowCnt = 0;//initializes notLowCnt at 0
        for (int i = 0; i < x.length; i++) {
            if (x[i].getQuantity() < 5) {//when getQuantity is less than 5
                System.out.println(x[i].toString());
            } else {
                notLowCnt++;//increment notLowCnt
            }
            if (notLowCnt == x.length) {//the number of items above 5 = length of array
                System.out.println("All items have quantity greater than 5.");//prints message
            }

        }
    }

    public static void totalInventoryValue(Item[] x) {//method to compute total value of current inventory
        double cnt = 0;//initializes cnt at 0
        for (int i = 0; i < x.length; i++) {
            cnt += x[i].getQuantity() * x[i].getPrice_per_unit();//total inventory = cnt, calls get methods of quantity and ppu, cnt+cnt each time product
        }
        System.out.printf("Total Inventory Value is: %.2f\n",cnt);//prints the total value of inventory
    }

    public static void main(String[] args) {
        File fn = new File("items.txt");//file object holds data from file
        Scanner in = null; //declare scanner to read data from file
        Item[] x = new Item[10];
        int i = 0;//i is row index
        try {
            in = new Scanner(fn);//pass File object fn to Scanner
            while (in.hasNextLine()) {//while have data to read from file, and haven't read more than 10 rows
                x[i] = new Item(in.next(), in.nextInt(), in.nextDouble());//read in three values on each row
                i++;
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());//when the file is not found, prints a message

        }
        char option;//creates variable for user to input a char
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Print Inventory (p)\nCheck Low Inventory (c)\nPrint Total Value of Inventory(v)\nExit(e)");//\n creates ln
            System.out.println("\nChoose one of the following: ");//asks user to choose a letter
            option = input.next().charAt(0);//stores in object the input

            switch (option) {
                case 'p'://if user puts in p, calls printinventory method
                    printInventory(x);
                    break;
                case 'c'://if user puts in c, calls checkLowInventory method
                    checkLowInventory(x);
                    break;
                case 'v'://if user puts in v, calls totalInventoryValue method
                    totalInventoryValue(x);
                    break;
            }
        } while (option != 'e');//until user puts in e, loop will run

    }
}
