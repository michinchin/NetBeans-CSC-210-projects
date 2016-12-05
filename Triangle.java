package triangle;

import java.util.Scanner;

/**
 *
 * @author Tony
 */
public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return this.sideA;
    }

    public void setSideA(int a) {
        this.sideA = a;
    }

    public int getSideB() {
        return this.sideB;
    }

    public void setSideB(int b) {
        this.sideB = b;

    }

    public int getSideC() {
        return this.sideC;
    }

    public void setSideC(int c) {
        this.sideC = c;
    }

    // A scalene triangle has all unequal sides.
    public boolean isScalene() {
        return (sideA != sideB && sideA != sideC && sideC != sideB);
    }

    // A right triangle satisfies the Pythagorean theorem.
    public boolean isRight() {
        return ((sideA * sideA + sideB * sideB == sideC * sideC)
                || (sideA * sideA + sideC * sideC == sideB * sideB)
                || (sideB * sideB + sideC * sideC == sideA * sideA));

    }

    // An isosceles triangle has TWO equal sides.
    public boolean isIsosceles() {
        return ((sideA == sideB) && sideA != sideC)
                || ((sideA == sideC) && sideA != sideB)
                || ((sideB == sideC) && sideB != sideA);

    }

    // An equilateral triangle has all equal sides.  
    public boolean isEquilateral() {
        return (sideA == sideB && sideA == sideC);
    }

    // Given a Triangle object, see if the Triangle is valid
    public boolean isValid() {
        return (sideA + sideB > sideC
                && sideA + sideC > sideB
                && sideB + sideC > sideA);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        while (true) {
            //Prompt user for side a
            System.out.print("Enter the length of side A: ");
            a = input.nextInt();
            //Prompt user for side b
            System.out.print("Enter the length of side B: ");
            b = input.nextInt();
            //Prompt user for side c
            System.out.print("Enter the length of side C: ");
            c = input.nextInt();
            //Create triangle object
            Triangle tri = new Triangle(a, b, c);
            System.out.println("Valid Triangle       : " + tri.isValid());
            System.out.println("Right triangle       : " + tri.isRight());
            System.out.println("Scalene Triangle     : " + tri.isScalene());
            System.out.println("Isocseles Triangle   : " + tri.isIsosceles());
            System.out.println("Equilateral Triangle : " + tri.isEquilateral());
            System.out.println();

            //print values for triangle
            System.out.print("Read in a new triangle?(-1 for no, 1 for yes): ");
            if (input.nextInt() < 0) {
                break;

            }
        }

    }
}
