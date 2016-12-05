/*
 * Abigail Chin
 * Anthony Souza
 * CSC 210
 * 4/15/16
 */
package ccvalidator;

import java.util.Scanner;

/**
 *
 * @author Abigail
 */
public class CCValidator {

    public static int getSize(long d) {//counts number of digits in number given
        int size = 0;//start at 0
        while (d > 0) {//when the number given is over 0
            d /= 10;//chop off last number
            size++;//add one to the count of single digits
        }
        return size;//return the count
    }

    public static int getDigit(int num) {//returns number if it is a single digit, otherwise, returns sum of the two digits 
        if (num <= 9) {//must be single digit/under 10
            return num;//return the same number
        } else {//if not the first
            int first = num / 10;//divides the double digit number by 10 so you get first digit
            int second = num % 10;//gets the remainder of the divided number which is the ones place
            return first + second;//adds both the first and second number in double digits
        }
    }

    public static long getPrefix(long num, int k) {//returns first k number of digits from number. If number of digits in number is less than k, return number
        if (getSize(num) < k) {//if size is less than k, returns the num
            return num;
        } else {
            int size = getSize(num);//defines size of number
            for (int i = 0; i < (size - k); i++) {//for loop
                num /= 10;
            }
        }
        return num;
    }

    public static boolean prefixMatched(long num, int d) {
        int prefix = (int) getPrefix(num, d);//defines prefix as putting cc number and d into getPrefix method to get the prefix
        String cardType = "";//initializes variable cardType
        switch (prefix) {
            case 4://when prefix is 4
                cardType = "Visa";//defines as visa
                break;
            case 5://when prefix is 5
                cardType = "Master Card";
                break;
            case 37://when prefix is 3
                cardType = "American Express";
                break;
            case 6://when prefix is 6
                cardType = "Discover";
                break;
            default://if none of the above, card invalid
                return false;
        }
        return true;//if any of above, valid
    }

    public static int sumOfDoubleEvenPlace(long num) {

        int result = 0;//defines variable to store result
        int lastDigit = 0;//defines a variable called lastDigit

        for (int i = getSize(num) - 1; i >= 0; i--) {//counts down from the (max-1) size of the number to 0 
            lastDigit = (int) (num % 10);//gets the last digit of the number

            if (i % 2 == 0) {//gets the even digit in the cc number 
                result += getDigit(lastDigit * 2);//if the (lastDigit*2)>=9, then it'll add the sum of the two digits, if not it'll keep it at (lastDigit*2)

            }

            num = num / 10;//chops off last number
        }
//        while (number > 0) {
//            res = number % 100;//remainder after divided by 100 gives every even place number
//            result += getDigit((int) (res / 10) * 2);//gets last number and multiplies by 2 while adding the two digits if bigger than 9
//            number = number / 100;//updates to get rid of last two numbers
//        }

        return result;
    }

    public static int sumOfOddPlace(long num) {
        int result = 0;
        int lastDigit = 0;

        for (int i = getSize(num) - 1; i >= 0; i--) {//counts down from (max-1) number to 0
            lastDigit = (int) (num % 10);//gets the last digit of number, if you divide by 10, what the remainder is
            if (i % 2 != 0) {//if digit is in the odd place of the number
                result += lastDigit;//add the lastDigit to the sum

            }
            num = num / 10;//chops off last digit
        }
//        int result = 0;
//
//        while (num > 0) {//repeats as long as num>0
//            result += (int) (num % 10);//to get odd number
//            num = num / 100;//update
//        } 

        return result;//return the number
    }

    public static boolean isValid(long num) {

        int total = sumOfDoubleEvenPlace(num) + sumOfOddPlace(num);//adds both of the sums together

        if ((total % 10 == 0) && (prefixMatched(num, 1) == true) && (getSize(num) >= 13) && (getSize(num) <= 16)) {//when number is between 13 and 16 and when it's even
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter credit card number: ");//prompts user for number
        long input = in.nextLong();//lets user input number 

        if (isValid(input)) {//if the isValid is true, then the card number is valid
            System.out.println("The CC number: " + input + " is valid.");
        } else {//if not, invalid
            System.out.println("The CC number: " + input + " is invalid.");
        }

    }
}
