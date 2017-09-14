
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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initalize scanner
        Scanner input = new Scanner(System.in);

        // create an array that will store 10 words and call it "words"
        String[] words = new String[10];

        // run a for loop to populate the "words" array with (in this instance) 10 words
        for (int i = 0; i < words.length; i++) {
            // ask user to enter a word
            System.out.println("Enter in word " + (i + 1));
            words[i] = input.nextLine();
        }

        // converting the 10 words character count into doubles
        double word1 = words[0].length();
        double word2 = words[1].length();
        double word3 = words[2].length();
        double word4 = words[3].length();
        double word5 = words[4].length();
        double word6 = words[5].length();
        double word7 = words[6].length();
        double word8 = words[7].length();
        double word9 = words[8].length();
        double word10 = words[9].length();

        // printing out the average word length by adding all the character counts and dividing by 10
        System.out.println("The average word length is: " + (word1 + word2 + word3 + word4 + word5 + word6 + word7 + word8 + word9 + word10) / 10);

    }

}
