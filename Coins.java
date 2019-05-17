// Ariel Gelman
// Lab Assignment 7

/* Coins Class
   Complete the constructor and all accessor and mutator methods
   Where there is a comment "add code here", add or change the code
   to make the methods functional
   Name :
*/

import java.text.DecimalFormat;

public class Coins
{
  public final DecimalFormat MONEY = new DecimalFormat( "$#,##0.00" );
  

  // instance variables
  private int quarters;
  private int dimes;
  private int nickels;
  private int pennies;


  /**
  * Overloaded constructor:
  * Allows client to set beginning values for quarters,
  *   dimes, nickels, and pennies
  * This constructor takes four parameters
  * Calls mutator methods to validate new values
  *  newQuarters the number of quarters
  *  newDimes the number of dimes
  *  newNickels the number of nickels
  *  newPennies the number of pennies
  */
  public Coins( int newQuarters, int newDimes, int newNickels, int newPennies)
  {

  setQuarters(newQuarters);
  setDimes(newDimes);
  setNickels(newNickels);
  setPennies(newPennies);


  }

  /** Accessor getQuarters() method
  * returns the number of quarters
  */
  public int getQuarters( )
  {
    return quarters; // add code here
  }

  /**
  * Mutator method:
  * Allows client to set value of quarters.
  * Prints an error message if the value is less than 0.
  * setQuarters() does not change the value
  * of quarters if newQuarters has negative value.
  * Displays the following two error messages:
  * "The number of quarters cannot be negative."
  * "Value not changed."
  * newQuarters the new number of quarters
  */
  public void setQuarters( int newQuarters)
  {



    if (newQuarters >= 0)
    quarters = newQuarters;
    else

   {
      System.err.println( "The number of quarters cannot be negative.");
      System.err.println( "Value not changed.");
   }

  }

  /** Accessor getDimes() method
  * returns number of dimes
  */
  public int getDimes( )
  {
    return dimes; // add code here
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of dimes.
  * Prints an error message if the value is less than 0.
  * setDimes() does not change the value of dimes if
  * newDimes has negative value.
  * Displays the following two error messages:
  * "The number of dimes cannot be negative."
  * "Value not changed."
  * newDimes the new number of dimes
  */
  public void setDimes( int newDimes )
  {
    if (dimes >= 0)
        dimes = newDimes;
    else

    {
      System.err.println( "The number of dimes cannot be negative." );
      System.err.println( "Value not changed." );
    }
  }

  /** Accessor getNickels() method
  * returns the number of nickels
  */
  public int getNickels( )
  {
    return nickels;  // add code here
  }

  /**
  * Mutator method:
  * Allows client to set value of nickels.
  * Prints an error message if the value is less than 0
  * setNickels() does not change the value of nickels if
  * newNickels has negative value.
  * Displays the following two error messages:
  * "The number of nickels cannot be negative."
  * "Value not changed."
  * newNickels the new number of nickels
  */
  public void setNickels( int newNickels )
  {    
   if (nickels >= 0)
       nickels = newNickels;
   else
    {
      System.err.println( "The number of nickels cannot be negative." );
      System.err.println( "Value not changed." );    
    }
  }

  /** Accessor getPennies() method
  * returns the number of pennies
  */
  public int getPennies( )
  {
    return pennies; // add code here
  }

  /**
  * Mutator method:
  * Allows client to set value of pennies.
  * Prints an error message if the value is less than 0
  * setPennies() does not change the value of pennies if
  * newPennies has negative value.
  * Displays the following two error messages:
  * "The number of pennies cannot be negative."
  * "Value not changed."
  * param newPennies the new number of pennies
  */
  public void setPennies( int newPennies )
  {
    if ( pennies >= 0 )
    pennies = newPennies;
    else

    {
      System.err.println( "The number of pennies cannot be negative." );
      System.err.println( "Value not changed." );
    }
  }

  /**
  * @return the number of quarters, dimes, nickels, and pennies for the coins
  */
  public String toString()
  {
    return( "quarters: " + quarters + "; dimes: " + dimes
          + "; nickels: " + nickels + "; pennies:" + pennies );
  }

  /**
  * equals method
  * Compares two Coins objects for the same field values
  * @param c another Coins object
  * @return a boolean, true if this object
  * has the same field values as the parameter c
  */
  public boolean equals( Coins c )
  {
    return ( quarters == c.quarters && dimes == c.dimes
          && nickels == c.nickels && pennies == c.pennies );
  }

  /**
  * outputTotalAmount method
  * Outputs the total amount in $ notation
  */
  public void outputTotalAmount( )
  {
    double total = .25 * quarters + .1 * dimes + .05 * nickels + .01 * pennies;
    System.out.println( "Total amount: " + MONEY.format( total ) );
  }

  /**
  * moneyFromQuarters method
  * Computes the dollar amount from quarters
  * @return a double, the dollar money amount from quarters
  */
  public double moneyFromQuarters( )
  {
    return ( quarters * .25 );
  }

  /**
  * moneyFromDimes method
  * Computes the dollar amount from dimes
  * @return a double, the dollar money amount from dimes
  */
  public double moneyFromDimes( )
  {
    return ( dimes * .1 );
  }

  /**
  * moneyFromNickels method
  * Computes the dollar amount from nickels
  * @return a double, the dollar money amount from nickels
  */
  public double moneyFromNickels( )
  {
    return ( nickels * .05 );
  }

  /**
  * moneyFromPennies method
  * Computes the dollar amount from pennies
  * @return a double, the dollar money amount from pennies
  */
  public double moneyFromPennies( )
  {
    return ( pennies * .01 );
  }
}