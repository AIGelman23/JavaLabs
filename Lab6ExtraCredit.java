
import javax.swing.JOptionPane;

// Ariel Gelman
// Lab Assignment 6 - Extra Credit
/*
 * Celsius to Fahrenheit
 */

public class Lab6ExtraCredit

{

    public static void main(String[] args)
  
    {
        char repeat;
        double celsiusValue;
        double temp;

        do
        {
        String input = JOptionPane.showInputDialog("Enter a temperature in Celsius >");
        celsiusValue = Double.parseDouble(input);
        temp = convertFahrenheit(celsiusValue);
        findSeason(temp);
        
        input = JOptionPane.showInputDialog("Enter 'Y' to continue");
        repeat = input.charAt(0);

        
        }
        while(repeat == 'Y' || repeat == 'y');

       if (repeat == 'N' || repeat == 'n')
       {
       System.exit(0);
       }

    }
    
         public static double convertFahrenheit(double celsiusValue)

    {
           double fahrenheit;
           return fahrenheit = (1.8 * celsiusValue) + 32;
            

             
    }
        

         public static void findSeason(double temp)
    {

         if(temp < -15 || temp > 110)
        {
            JOptionPane.showMessageDialog(null, "The temperature is out of range");
        }

        if(temp >= 80 && temp <= 110)
        {
            JOptionPane.showMessageDialog(null, "It is probably summer.");
        }

        if(temp >= 60 && temp < 80)
        {
            JOptionPane.showMessageDialog(null, "It is probably spring.");
        }

        if(temp >= 40 && temp < 60)
        {
            JOptionPane.showMessageDialog(null, "It is probably fall.");
        }

        if(temp < 40 && temp >= -15)
        {
            JOptionPane.showMessageDialog(null, "It is probably winter.");
        }
        
    }

}
