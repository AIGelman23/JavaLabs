// Ariel Gelman
// Lab Assignment 5

import java.util.Scanner;
import java.util.Random;

public class LabAssign5

{

    public static void main(String[] args)

    {

        Scanner inData = new Scanner(System.in);
        int randomNumber = 0, userGuess = 0;
        int numberOfAttempts = 1;
        Random RGenerate = new Random();

        randomNumber = RGenerate.nextInt(20) + 1;
        System.out.print("Enter a number between 1 and 20: -> ");
        userGuess = inData.nextInt();

do

 {
     if(userGuess != randomNumber && userGuess > 0 && userGuess < 21)
     {
     System.out.println("Try again.");
     System.out.print("Enter a number between 1 to 20: -> ");

     userGuess = inData.nextInt();
     ++numberOfAttempts;
     }
 else
     {
     System.out.print("Enter a number between 1 to 20: -> ");
     userGuess = inData.nextInt();
     }

 }
        while(userGuess != randomNumber);
        
 if(userGuess == randomNumber)
     {
     System.out.println("You won!");
     System.out.println("The number guesses is " + numberOfAttempts);
     }



    System.exit(0);

            }
    }

