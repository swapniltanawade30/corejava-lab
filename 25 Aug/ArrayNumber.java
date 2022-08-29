/*
Program:Java program to find largest and second largest number array
@code by:swapnil
date:25/08/22
*/

class ArrayNumber
{
   static void printArray(int ... arr)
   {
	   
	   // printing all the elements of the array
	    for(int i:arr)
		{
			System.out.println(i);
		}
	   
	   sortArray(arr);
	   	   
	   
   }
   
   // method to sort the array
   
   static void sortArray(int ... myarray)
   {
	   int len= myarray.length;
	   System.out.println("The size of the array is :"+len);
	   int temp;
	   // sorting the array in ascending order
	   
	   for(int j=0;j<len;j++)
	   {
		   for(int k=j+1;k<len;k++)
		   {
			   if(myarray[j]>myarray[k])
			   {
				   temp=myarray[j];
				   myarray[j]=myarray[k];
				   myarray[k]=temp;
				   
			   }
				   
		   }
		   
	   }
	   // ending sorting
	   
	   System.out.println("The largest element in array is:"+ myarray[len-1]);
	   System.out.println("The second Largest element in array is:"+ myarray[len-2]);
	   
   }


   public static void main(String ...args)
   {
	  
	  int size =args.length;
	   //System.out.println(size);
	   
	   int newArray[]= new int[size];
	   
	   // setting array elements
	   for(int i=0;i<size;i++)
	   {
		   newArray[i]= Integer.parseInt(args[i]);
	   } 
	 	printArray(newArray);   
   }

  
}