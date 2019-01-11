package Chapter02;

import java.util.Scanner;

/**
 * calculates interests
 *
 * @author Alan Kelly
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// step 1 get the bal
        System.out.print("Enter balance: ");
        double V0 = input.nextDouble();
        // step 2

        System.out.print("Enter Interest rate: ");
        double V1 = input.nextDouble();

        double acc = (V1 / 1200) * V0;

        System.out.println(acc);

    }

}
