
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maloof
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize scanner
        Scanner input = new Scanner(System.in);
        // create a string called words (the words will run through this string)
        String words = new String();
        // integer for word count; in order to count the words
        int wordCount = 0;

        // ask user for series of words, exit = exit(and word count)
        System.out.println("Type in a series of words, type 'exit' to end the program and view the amount of words you entered:");
        while (true) {
            // assign input to string word, counter increases by 1 everytime
            words = input.nextLine();
            wordCount++;
            // if the word equals exit, subtract 1 from the counter and end the program outputting the word count
            if (words.equals("exit")) {
                wordCount--;
                System.out.println("The number of words you typed: " + wordCount);
                break;

            }
        }

    }
}
