/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables for population, year, sample (place holder value), and growth value
        double population = 6;
        int year = 1999;
        double growth = 0.014;
        double sample = 0;

        // while the population is less than 10B
        while (population < 10) {
            sample = population * growth;
            population = population + sample;
            // add a year everytime population is multiplied by growth per year
            year++;
        }
        // print year the population exceeded 10 billion
        System.out.println("The population will have exceeded 10 billion in the year: " + year);
    }
}
