/*
Program: Java program to print a pattern 		
            *		
         *  *		
     *    *   *		
*      *    *    *	
@code by:Swapnil
date:15 sep 2022
*/
import java.io.*;
 
// creating a class startrangle
 class StarTrangle 
{
    // creating a method print trangle
     static void printTriangle(int n)
    {
        // outer loop 
        for (int i=0; i<n; i++)
        {
 
            // inner loop 
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
  
            //  inner loop 
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
  
            
            System.out.println();
        }
    }
     
    // calling main method
    public static void main(String... args)
    {
        int num=Integer.parseInt(args[0]);
        printTriangle(num);// calling print trangle
    }
}