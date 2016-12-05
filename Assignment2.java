/*
 * Abigail Chin
 * February 10, 2016
 * CSC 210
 * Calculate the distance an object would fall under Earth's gravity when the
 acceleration=-9.8 m/s^2, time=15 seconds, initial velocity=0 m/s, and the
 initial position=0 m.
 */
package assignment.pkg2;

/**
 * English Description: In order to compute the distance an object would fall
 * under Earth's gravity, you will need to use the equation xf = 0.5∗at^2 + vit
 * + xi. Where a is the acceleration, t is time, vi is the initial velocity, and
 * xi is the initial position. We will need to declare four variables to store
 * the following initial values: t=15s, a=-9.8 m/s^2, vi=0 m/s, xi= 0 m. These
 * will be stored as doubles. The resultant, xf will be stored as a fifth
 * variable, a double data type as well, with an initial value of zero. So, to
 * find the resultant, xf, we will use the equation xf = 0.5∗at2 + vit + xi and
 * assign the answer to x(t). Then, we will print the statement, "The final
 * position of an object dropped for 15 seconds with initial position 0, initial
 * velocity 0, and acceleration due to gravity -9.8 m/s^2 is: " +xf.
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = -9.8; //value of acceleration
        double t = 15; //value of time
        double vi = 0; //value of initial velocity
        double xi = 0; //value of initial position
        double xf = 0.; //resulting position

        xf = 0.5 * a * t * t + vi * t + xi;//equation to compute final position

        //output message to print resultant value
        System.out.println("The final position of an object dropped for 15 seconds"
                + " with initial position 0, initial velocity 0,and acceleration due to "
                + "gravity-9.8 m/s^2 is: " + xf);

    }

}
