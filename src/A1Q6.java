
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initalize scanner
        Scanner input = new Scanner(System.in);
        int start = 100;

        // ask user for number between 50 and 100 and if not followed they are told to stop cheating
        System.out.println("Enter a number between 50 and 100 to stop at:");
        // store input as number
        int number = input.nextInt();
        
        if (number < 50 || number > 100) {
            System.out.println("STOP CHEATING");
        } else {
            // print out starting number
            System.out.println(start);
            // if start is greater than number by 5, count down (by 5) and print start
            while (start - 5 >= number) {
                start = start - 5;
                System.out.println(start);

            }

        }

    }

}
