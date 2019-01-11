package Chapter02;

import java.util.Scanner;

/**
 * calculates velocity and time to figure out acceleration speed
 *
 * @author Alan Kelly
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// step 1 get the V0
        System.out.print("Enter V0: ");
        double V0 = input.nextDouble();
        // step 2

        System.out.print("Enter V1: ");
        double V1 = input.nextDouble();

        System.out.print("Enter T: ");
        double T = input.nextDouble();

        double acc = (V1 - V0) / T;

        System.out.println(acc);

    }

}
