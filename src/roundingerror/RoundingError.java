/*
 * William Z.
 * This program will determine the rounding error when the inputted number is square rooted and then squared.
 */

package roundingerror;
import static java.lang.Math.*;
import javax.swing.*;
/**
 *
 * @author wizwa9381
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables.
        int userInput = 0;
        double forRounding = 0;
        double forRounding_1 = 0;
        double compare = 0;
        //Make sure the user actually inputs an integer to have it not crash my program.
        try {
            userInput = Integer.parseInt(JOptionPane.showInputDialog("Input an integer number that you want square rooted and then squared."));
        } catch(NumberFormatException ex) {
            System.err.println("That wasn't an integer.");
            System.err.println(ex);
        }
        //Calculations and showing the results.
        System.out.println("Your number is: "+userInput);
        forRounding = (double)sqrt(userInput);
        forRounding = pow(forRounding,2);
        System.out.println("Java rounding says your number was: "+forRounding);
        if(userInput > forRounding) {
            compare = userInput - forRounding;
        } else {
            compare = forRounding - userInput;
        }
        System.out.println("The rounding difference is: "+compare);
    }
    
}