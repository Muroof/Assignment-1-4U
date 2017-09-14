
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initalize scanner
        Scanner input = new Scanner(System.in);

        // ask the committee for all costs
        System.out.println("How much did food cost:");
        int food = input.nextInt();

        System.out.println("How much was the dj:");
        int dj = input.nextInt();

        System.out.println("How much was the hall rental:");
        int hall = input.nextInt();

        System.out.println("How much were decorations:");
        int decorations = input.nextInt();

        System.out.println("How much was wait staff");
        int waitstaff = input.nextInt();

        System.out.println("How much were miscellaneous expenses");
        int miscellaneous = input.nextInt();

        // tickets cost 35
        int ticketcost = 35;

        // add all the expenses
        double expenses = food + dj + hall + decorations + waitstaff + miscellaneous;

        // determine amount of tickets needed to break even by dividing expenses by ticket cost
        double ticketamount = Math.ceil(expenses / ticketcost);

        // output to user how many tickets are required in order to break even
        System.out.println("In order to break even you will need to sell: " + ticketamount + " tickets");

    }
}
