
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initalize scanner
        Scanner in = new Scanner(System.in);

        // array that will hold 3 numbers
        int[] numbers = new int[3];
        // for loop to retrieve numbers
        for (int i = 0; i < numbers.length; i++) {
            // ask user for number
            System.out.println("Enter a number");
            numbers[i] = in.nextInt();

        }

        // calculating the product, and then the sqaure root and sqaure of said product
        double product = numbers[0] * numbers[1] * numbers[2];
        double squareroot = Math.sqrt(product);
        double sqaure = Math.pow(product, 2);

        // printing the product, square, and square root
        System.out.println("The product is: " + product);
        System.out.println("The sqaure of the product is: " + sqaure);
        System.out.println("The sqaure root of the product is: " + squareroot);

    }
}
