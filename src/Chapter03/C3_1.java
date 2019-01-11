package Chapter03;

import java.util.Scanner;

/**
 * Calculates what day it is like monday
 *
 * @author Alan Kelly
 */
public class C3_1 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Todays date: ");
        double first = input.nextInt();

        System.out.print("Days elapsed: ");
        double second = input.nextInt();

        double today = first + second;

        double time = today % 7;

        if (first == 1) {
            System.out.print("Today is Monday ");
        } else if (first == 2) {
            System.out.print("Today is Tuesday ");
        } else if (first == 3) {
            System.out.print("Today is Wednesday ");
        } else if (first == 4) {
            System.out.print("Today is Thursday ");
        } else if (first == 5) {
            System.out.print("Today is FRIDAY ");
        } else if (first == 6) {
            System.out.print("Today is Saturday ");
        } else if (first == 0) {
            System.out.print("Today is Sunday ");
        }

        if (today == 1 || time == 1) {
            System.out.print("and the future day is Monday ");
        } else if (today == 2 || time == 2) {
            System.out.print("and the future day is Tuesday ");
        } else if (today == 3 || time == 3) {
            System.out.print("and the future day is Wednesday ");
        } else if (today == 4 || time == 4) {
            System.out.print("and the future day is Thursday ");
        } else if (today == 5 || time == 5) {
            System.out.print("and the future day is FRIDAY ");
        } else if (today == 6 || time == 6) {
            System.out.print("and the future day is Saturday ");
        } else if (today == 0 || time == 0) {
            System.out.print("and the future day is Sunday ");
        }
    }

}
