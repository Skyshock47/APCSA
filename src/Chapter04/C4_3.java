package Chapter04;

import java.util.Scanner;

/**
 * calculates how much money you earned and how much tax is taken away
 *
 * @author Alan Kelly
 */
public class C4_3 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double perhour = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedtax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double statetax = input.nextDouble();

        double gross = (hours * perhour);
        double fed = (gross * fedtax);
        double state = (gross * statetax);
        double totalduc = (fed + state);
        double total = (gross - totalduc);

        System.out.println("Employee Name: " + name);
        System.out.printf("Hours worked: %.2f\n", hours);
        System.out.printf("Pay Rate: %.2f\n", perhour);
        System.out.printf("Gross pay: %.2f\n", gross);
        System.out.println("Dedcutions:");
        System.out.printf("Federal Withholding 20: %.2f\n", fed);
        System.out.printf("State Withholding 9 : %.2f\n", state);
        System.out.printf("Total Deduction: %.2f\n", totalduc);
        System.out.printf("Net pay: %.2f\n", total);

    }

}
