package Chapter02;

import java.util.Scanner;

/**
 * calculates the price of a meal + tax
 *
 * @author Alan Kelly
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// step 1 get the meal price 
        System.out.print("Enter Meal Price: ");
        double meal = input.nextInt();
        // step 2 get price of drink and dessert

        System.out.print("Enter Dessert Price: ");
        double drink = input.nextInt();

        System.out.print("Enter Dessert Price: ");
        double dessert = input.nextInt();

        double mealprice = drink + meal + dessert;

        double tax = mealprice * .10;
        double tip = (mealprice + tax) * .15;
        double total = (tax + tip + mealprice);

        System.out.println("Price: " + mealprice);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);

        System.out.println("Total: " + total);

    }

}
