
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initalize scanner
        Scanner input = new Scanner(System.in);
        // ask user for inital amount (principal) and interest rate, store them as doubles 
        System.out.println("What's the inital amount my guy:");
        double balance = input.nextInt();
        System.out.println("What's the inital interest rate in percent?:");
        double interest = input.nextInt();

        // double to represent double the inital principle, integer for year - start at zero
        double doublePrinciple = balance * 2;
        int years = 0;

        // convert interest rate into decimal
        interest = interest / 100;
        
        // determine how many years it will take to double inital principle using while loop
        while (balance < doublePrinciple) {
            balance = (1 + interest) * balance;
            years++;
        }
        // print to user the number of years required to double inital principle
        System.out.println("In order to double your inital balance, it will take: " + years);

        // determine how many years it will take for the balance to reach a million dollars using a while loop
        while (balance < 1000000) {
            balance = (1 + interest) * balance;
            years++;
        }
        // print to user the number of years required to reach a million dollars in balance
        System.out.println("For your balance to be equal to or greater than a million dollars it will take: " + years);

    }
}
