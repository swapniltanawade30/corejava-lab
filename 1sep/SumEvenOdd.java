/*
Program :  Write a program that reads a set of integers, and then prints the sum of the even and odd integers.(using arrays) 
code by : Swapnil
Date :01 September 2022
*/

import java.util.*;
class SumEvenOdd {
 
    // Function to calculate sum
    static void EvenOddSum(int[] arr, int n)
    {
        int even = 0;
        int odd = 0;
 
        // Loop to find even, odd sum
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }
        System.out.println("The sum of Even number is :" + even);
        System.out.print("The sum of Odd number is :" + odd);
    }
  //calling main method
    public static void main(String...args)
    {
		//declaring arrays
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
 
        EvenOddSum(arr, n);
    }
}// code end