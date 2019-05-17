
import java.util.Scanner;

// Ariel Gelman
// Lab Assignment 2 CIT111

public class LabAssign2 {

    public static void main(String[] args) 
    
   {

        int milesDriven;
        double fuelUsed;
        double milesperGallon = 0.0;
        Scanner inData = new Scanner(System.in);

        System.out.print ("Enter the miles driven: -> ");
        milesDriven = inData.nextInt();

        System.out.print ("Enter the gallons of fuel used: -> ");
        fuelUsed = inData.nextDouble();

        milesperGallon = milesDriven / fuelUsed;
        System.out.println("\nThe miles-per-gallon based on the data entered is: " + milesperGallon);
        
    }

}
