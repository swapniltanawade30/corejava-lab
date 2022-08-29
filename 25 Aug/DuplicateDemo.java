/*
Program:Java program to remove duplicate elements
@code by:swapnil
date:25/08/22
*/

class DuplicateDemo
{
   static void removeDuplicate(int [] a, n)
   {
	   if (n==0||n==1)
	   {
		   return n;
	   }
	   //creating another array for only sorting
	   int[] temp=new int[n];
	   int j=0;
	   for(int 1=0;i<n-1;i++)
	   {
		   if(a[i] !=a[i+1])
		   {
			   temp[j++]=a[i];
		   }
	   }
	   temp[j++]=a[n-1];
	   //changing the orignal array
	   for(int i=0;i<j;i++)
		   a[i]=temp[i];
   }
   return j;
}
public static void main(String[] args)
{
	int a[] ={1,12,3,4,4,8};
	int n=a.length;
	n=removeDuplicate(a,n);
	
	//printing the array elements
	for(int i=0;i<n; i++)
		System.out.println(a[i]+"");
}
}
     