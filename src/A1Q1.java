
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initalize scanner
        Scanner in = new Scanner(System.in);

        // ask user for their name
        System.out.println("Hello! What's your name");
        // take next line
        String name = in.nextLine();
        // greet user
        System.out.println("Hello " + name);

    }
}
