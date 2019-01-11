package Chapter04;

import java.util.Scanner;

/**
 * tells if the first string is a substring of the second string
 *
 * @author Alan Kelly
 */
public class C4_2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s1 = input.next();

        System.out.print("Enter string: ");
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.print(s2 + " is a substring of" + s1);
        } else {
            System.out.print(s2 + " is not a substring of " + s1);
        }

    }

}
