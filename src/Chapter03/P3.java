package Chapter03;

import java.util.Scanner;

/**
 * tells if first number is equal, not equal, less than, greater than to the
 * second number
 *
 * @author Alan Kelly
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First Number: ");
        double first = input.nextInt();
        System.out.print("First Number: ");
        double second = input.nextInt();
        if (first < second) {
            System.out.println("Number one is less than to Number two: ");
        }

        if (first > second) {
            System.out.println("Number one is greater than Number two: ");
        }

        if (first == second) {
            System.out.println("Number one is = to Number two: ");
        }

        if (first <= second) {
            System.out.println("Number one is less than or = to Number two: ");
        }
        if (first != second) {
            System.out.println("Number one is not = to Number two: ");
        }

        if (second == 0) {
            System.out.println("Cannot divide by 0");
        } else if (first / second < 1) {
            System.out.println("Proper fraction");
        } else if (first / second >= 1) {
            System.out.println("Improper fraction");
        }

        if (first >= 90) {
            System.out.println("A");
        } else if (first >= 80) {
            System.out.println("B");
        } else if (first >= 70) {
            System.out.println("C");
        } else if (first >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (second >= 1 & second <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

    }

}
