// Ariel Gelman
// Lab Assign3

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class LabAssign3

{

    public static void main(String[] args)

    {
        double numInches;
        double numMilli;
        String tempInput;
        DecimalFormat df = new DecimalFormat("#.000");
        
        tempInput = JOptionPane.showInputDialog("Enter the number of inches to be converted\n to millimeters: ");

        numInches = Double.parseDouble(tempInput);

        numMilli = numInches * 25.4;

        JOptionPane.showMessageDialog(null, numInches + " inches converts to " + df.format(numMilli) + " millimeters.");


        System.exit(0);

    }

}
