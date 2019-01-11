package Chapter02;

import java.util.Scanner;

/**
 * Calculates the cost of driving
 *
 * @author Alan Kelly
 */
public class C2_3 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// step 1 get the bal
        System.out.print("Enter Driving Distance: ");
        double DD = input.nextDouble();
        // step 2

        System.out.print("Enter miles per gal: ");
        double MPG = input.nextDouble();

        System.out.print("Enter price per gal: ");
        double ppg = input.nextDouble();

        double acc = (DD / MPG) * ppg;

        System.out.println("Cost of Driving: " + acc);

    }

}
