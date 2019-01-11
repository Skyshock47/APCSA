package Chapter04;

import java.util.Scanner;

/**
 * Calculates how much two bidders will charge and determines the best deal
 *
 * @author Alan Kelly
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First Bidder: ");
        String firstbid = input.next();
        System.out.print("How many hours of work: ");
        int hours = input.nextInt();
        System.out.print("Charge per Hour: ");
        double perhour = input.nextDouble();
        System.out.print("Second Bidder: ");
        String secondbid = input.next();
        System.out.print("How many hours of work: ");
        int secondhours = input.nextInt();
        System.out.print("Charge per Hour: ");
        double secondperhour = input.nextDouble();

        double firstcost = (hours * perhour);
        double secondcost = (secondhours * secondperhour);

        if (firstcost < secondcost) {
            System.out.printf("The winner is %s. Total: %.2f.", firstbid, firstcost);
        }
        if (secondcost < firstcost) {
            System.out.printf("The winner is %s. Total: %.2f.", secondbid, secondcost);
        }
        if (firstcost == secondcost && hours < secondhours) {
            System.out.printf("The winner is %s. Totalcost: %.2f. Hours: %d.", firstbid, firstcost, hours);
        }
        if (firstcost == secondcost && hours > secondhours) {
            System.out.printf("The winner is %s. Totalcost: %.2f. Hours: %d.\n", secondbid, secondcost, secondhours);
        }
        if (firstcost == secondcost && hours == secondhours) {
            System.out.printf("Both %s and %s have identical bids with %d hours at a rate of %.2f \n", firstbid, secondbid, hours, perhour);
        }

    }

}
