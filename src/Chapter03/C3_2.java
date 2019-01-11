package Chapter03;

import java.util.Scanner;

/**
 * tells weather a number is a palindrome
 *
 * @author Alan Kelly
 */
public class C3_2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");

        int num = input.nextInt(), a = 0, remainder, b;

        b = num;

        while (num != 0) {
            remainder = num % 10;
            a = a * 10 + remainder;
            num /= 10;
        }

        if (b == a) {
            System.out.println(b + " is a palindrome.");
        } else {
            System.out.println(b + " is not a palindrome.");
        }

    }

}
