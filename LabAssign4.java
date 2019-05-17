// Ariel Gelman
// Lab Assignment 4

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class LabAssign4

{

    public static void main(String[] args)

    {
        double average;
        int numHits;
        int numBats;
        String input;
        DecimalFormat df = new DecimalFormat(".###");
 
                
        input = JOptionPane.showInputDialog(null, "Enter the number of at-bats: ");
        numBats = Integer.parseInt(input);


 if (numBats == 0)
 {
           JOptionPane.showMessageDialog(null, "No average can be calculated because there are no at-bats.");
           System.exit(0);
        }

        input = JOptionPane.showInputDialog(null, "Enter the number of hits: ");
        numHits = Integer.parseInt(input);

        average = numHits / (double)numBats;


        if (average >= 0.300)
        {
            JOptionPane.showMessageDialog(null, "Player qualifies for All-Star Game.\n" +
                    "Batting average is " + df.format(average));
        }
 else
        {
        if (average <= 0.300)
        
            JOptionPane.showMessageDialog(null, "Player does not qualify for All-Star Game.\n" +
                    "Batting average is " + df.format(average));

        }

        System.exit(0);
    }
}
