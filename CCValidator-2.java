/**
 * Assignment 8 - Credit Card Validator Solution. 
 * Anthony J Souza 11/02/2013
 * This is one of the ways you could have implemented the credit card validator
 * assignment. If your solution differs from mine this is OK. What it is
 * important is you understand the code you write.
 */
package ccvalidator;

public class CCValidator {

    /**
     * Return true if the card number is valid
     *
     * This function will take a credit card number as its parameter. It will
     * first determine if the card belongs to one of the given vendors via the
     * isValidVendor Method.
     *
     * Then it will compute the two sums needed for the mod 10 check.
     *
     * And, finally it will perform the mod 10 check.
     */
    public static boolean isValid(long number) {
        int sum, sumEven, sumOdd;

        if (!isValidVendor(number)) {
            return false;
        }

        sumEven = sumOfDoubleEvenPlace(number);
        sumOdd = sumOfOddPlace(number);

        sum = sumEven + sumOdd;
        if ((sum % 10) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isValidVendor(long number) {
        final int validPrefix[] = {37, 4, 5, 6};
        long prefix;
        /**
         * get prefix of size two to check to see if cc number begins with 37
         */
        prefix = getPrefix(number, 2);
        if (prefixMatched(number, validPrefix[0])) {
            return true;
        }
        /**
         * Remove ones place digit. We only get to this code if the check to see
         * if 37 is a prefix returns false.
         */
        prefix /= 10;
        /**
         * check to see if the prefix is one of the remaining prefixes 4, 5, or
         * 6
         */
        for (int i = 1; i < 4; i++) {
            if (prefixMatched(number, validPrefix[i])) {
                return true;
            }
        }

        /**
         * if no prefix is matched return false.
         */
        return false;
    }

    /**
     * Get the result from Step 2
     */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        int digit;
        
        //remove un-needed digit 
        number = number / 10;
        
        while (number > 0) {
            digit = (int)(number % 10);
            sum += getDigit(digit*2);
            number /= 100;
        }
        return sum;
    }

    /**
     * Return sum of odd place digits in number
     */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 100;
        }
        return sum;
    }

    /**
     * Return this number if it is a single digit, otherwise, return * the sum
     * of the two digits
     */
    public static int getDigit(int number) {
        int sum = 0;

        if (number < 10) {
            sum = number;
        } else {
            sum += (number % 10);
            number /= 10;
            sum += (number % 10);
        }
        return sum;
        //Could also be done with 1 line of code as follows:
        //return (number%10)+(number/10);
    }

    /**
     * Return true if the digit d is a prefix for number
     */
    public static boolean prefixMatched(long number, int d) {
        String temp;
        Long prefix;
        int size = getSize(d);
        
        prefix = getPrefix(number,size);
        return prefix == d;
    }

    /**
     * Return the number of digits in d
     */
    public static int getSize(long d) {
        int count = 0;

        while (d > 0) {
            d /= 10;
            count++;
        }
        return count;
    }

    /**
     * Return the first k number of digits from number. If the number of digits
     * in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        int size = getSize(number);
        int remove_count = size - k;
        while(remove_count > 0){
            number/= 10;
            remove_count--;
        }
        return number;
    }

    public static void main(String[] args) {
        long validTest = 4388576018410707L;
        long inValidTest = 4388576018402626L;

        System.out.println("Credit Card Number " + validTest + (isValid(validTest) ? " is Valid" : " is Invalid"));
        System.out.println("Credit Card Number " + inValidTest + (isValid(inValidTest) ? " is Valid" : " is Invalid"));
    }

}
