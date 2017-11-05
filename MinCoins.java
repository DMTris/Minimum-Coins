/********************************************************
 *
 *  Project :  Java Minimum Coins Program
 *  File    :  MinCoins.java
 *  Name    :  Chris Langdale
 *  Date    :  10/28/17 (10/29/17)
 *
 *  Description : Create a min coins program from the flowchart logic provided.
 * 
 *  Program assumes a U.S. currency is used (less than $1 and greater than 0) and no 50-cent pieces are to be used.
 *
 ********************************************************/

package mincoins;

import java.util.Scanner;

//start of class
public class MinCoins
{

    //start of main
    public static void main(String[] args)
    {
        //variable declaration
        Scanner input = new Scanner(System.in);
        int change = 0, quarters = 0, dimes = 0, nickels = 0, pennies = 0;

        //output to user asking for change or zero to stop
        System.out.print("Please Enter Amount of Change (1-99) or ZERO to EXIT.\n\n");
        change = input.nextInt();

        //while change is not equal to zero
        while (change != 0) {
            //while change is greater or equal to a quarter
            while (change >= 25) {
                change = change - 25;
                quarters = quarters + 1;
            }//end of while change is greater or equal to 25

            //while change is greater or equal to a dime
            while (change >= 10) {
                change = change - 10;
                dimes = dimes + 1;
            }//end of while change is greater or equal to 10

            //while change is greater or equal to a nickel
            while (change >= 5)
            {
                change = change - 5;
                nickels = nickels + 1;
            }//end of while change is greater or equal to 5
            
            //assign the remaining change to pennies
            pennies = change;
            
            //output to user the coins to use for change
            System.out.printf("%nQuarters: %d%nDimes: %d%nNickels: %d%nPennies: %d%n%n", quarters, dimes, nickels, pennies);
            
            //reset variables to zero
            quarters = 0;
            dimes = 0;
            nickels = 0;
            pennies = 0;
            
            //output to user asking for change or zero to stop
            System.out.println("Please Enter Amount of Change (1-99) or ZERO to EXIT\n");
            change = input.nextInt();

        }//end of while change not equal to zero

    }//end of main

}//end of class
