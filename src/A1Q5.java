
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A1Q5 {

    /**2
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initalize scanner
        Scanner input = new Scanner(System.in);

        // ask user to enter a number between 1 to 10
        System.out.println("Enter a number between 1 to 10");
        int number = input.nextInt();

        // if the user doesn't use a number between 1 and 10 they are told to stop cheating
        if (number < 1 || number > 10) {
            System.out.println("STOP CHEATING");
        } else {
            // print number of lines and number of asteriks based on inputed number
            for (int a = 0; a < number; a++) {
                System.out.println("");
                for (int i = 0; i < number; i++) {
                    System.out.print("*");
                }

            }
            // seperate asteriks from build successful line
            System.out.println("");

        }

    }
}
