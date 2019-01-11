package Chapter04;

import java.util.Scanner;

/**
 * Tells you what academy you are in.
 *
 * @author Alan Kelly
 */
public class C4_1 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter acadame and year: ");
        String name = input.next();

        char firstletter = name.charAt(0);

        char secondletter = name.charAt(1);

        if (secondletter != '1' && secondletter != '2' && secondletter != '3' && secondletter != '4') {
            System.out.println("INVALID INPUT");
        } else if (firstletter == 'M') {
            System.out.print("Mathmatics");
        } else if (firstletter == 'C') {
            System.out.print("Computer Science");
        } else if (firstletter == 'I') {
            System.out.print("Information technology");

        }
        if (firstletter != 'M' && firstletter != 'C' && firstletter != 'I') {
            System.out.println("INVALID INPUT");
        } else if (secondletter == '1') {
            System.out.print(" Freshman");
        } else if (secondletter == '2') {
            System.out.print(" Sophomore");
        } else if (secondletter == '3') {
            System.out.print(" Junior");
        } else if (secondletter == '4') {
            System.out.print(" Senior");
        }

    }

}
