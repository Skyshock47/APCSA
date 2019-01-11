package Chapter03;

import java.util.Scanner;

/**
 * Rock Paper Scissors
 *
 * @author Alan Kelly
 */
public class C3_3 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Rock(0) Paper (1) Scissor(3): ");
        int you = input.nextInt();

        double scissor = 0;
        double rock = 1;
        double paper = 2;

        double com = (int) (Math.random() * 3);

        switch (you) {

            case 0:
                if (com == 0) {
                    System.out.print("Draw");
                } else if (com == 1) {
                    System.out.print("LOSE");
                } else if (com == 2) {
                    System.out.print("WIN!!!!");
                }
                break;

            case 1:
                if (com == 0) {
                    System.out.print("WIN!!!!");
                } else if (com == 1) {
                    System.out.print("Draw");
                } else if (com == 2) {
                    System.out.print("LOSE");
                }
                break;

            case 2:
                if (com == 0) {
                    System.out.print("LOSE");
                } else if (com == 1) {
                    System.out.print("WIN!!!!");
                } else if (com == 2) {
                    System.out.print("Draw");
                }
                break;

        }

    }

}
