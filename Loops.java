/*
 * Abigail Chin
 * Anthony Souza
 * CSC 210
 * March 4, 2016
 */
package loops;

/**
 *
 * @author Abigail
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------LOOP 1--------");
        for (int a = 0; a <= 110; a = a + 2) {//initialize; boolean; update
            System.out.println(a);//output
        }

        System.out.println("-------LOOP 2--------");
        int b = 100;//initializes
        while (b > 0) {//counts down(boolean)
            System.out.println(b);
            b = b / 2;//update
        }

        System.out.println("-------LOOP 3--------");
        int c = 1;//start from 1
        do {
            System.out.println(c);
            c = 2 * c;//multiplies by two each time as number increases
        } while (c < 17000);//the rounded up 15th power of 2

        System.out.println("-------LOOP 4--------");
        for (int d = 100; d <= 250; d++) {//counts up from 100 to 250, adds one each time
            if (d % 3 == 0 && d % 4 == 0) {//will only print numbers that are divisible by 3 and 4
                System.out.println(d);
            }
        }
        System.out.println("-------LOOP 5--------");
        int f = 150;//start at 150
        while (f > 0) {//count down to 0
            f--;//subtract 1 each time
            if (f % 9 == 0) {//only print numbers divisible by 9
                System.out.println(f);
            }
        }
        System.out.println("-------LOOP 6--------");
        int t = 2;//initialize
        for (int g = 2; g <= 60; g++) {//count up 
            t = t + t;//t+=t is same thing
            if (g == 30) {//at the 30th power
                System.out.println(t);
            }
        }
        System.out.println("-------LOOP 7--------");
        double sum = 0;//initial value of variable sum
        int i = 5000;//initial value of i
        do {
            sum = sum + 1. / i;//need to add decimal to make double
            i++;//adds 1
        } while (i <= 5000);//repeats number of times
        System.out.println(sum);

        System.out.println("-------LOOP 8--------");
        int n = 574837;
        int rev = 0;//first value for reverse of n
        while (n > 0) {//takes number and uses it if bigger than 0
            rev = rev * 10;//multiplies rev by 10 to get 0
            rev = rev + n % 10;//the new rev is added to the remainder of the number if divided by 10
            n = n / 10;//the number is then divided by ten
        }
        System.out.println(rev);
    }
}
