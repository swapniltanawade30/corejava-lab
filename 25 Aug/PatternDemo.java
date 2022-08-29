/*
Program :  Java program to print pattern 
code by : Swapnil
Date :25/08/22
*/


import java.util.*;  
//declaring the class
public class PatternDemo 
{              
public static void main(String[] args)   
{  
int i, j, num;  
Scanner sc = new Scanner(System.in);    
System.out.print("Enter the number of rows you want to print: ");      
 num = sc.nextInt();           
for (i = 1; i <= num; i++)  //inner loop 
{  
for (j = 1; j <= i; j++)  //outer loop
{  
System.out.print(i+" ");  //print value of i
}  
System.out.println();  
}           
}  
}