/*
@ Program: Print charater is vowel or consonant and also its ASCII value
code by : Swapnil
Date : 18/08/22
*/
class AsciiDemo
{
	static void asciiValue()
	{
		char ch='A';
		int value = ch;
		System.out.println("The ASCII value of"+ch+"is :"+value);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Enter a Character "+ ch +" is vowel");
			
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) //character from a to z or A to Z condition
			System.out.println("Enter a Character "+ ch +" is vowel");
	}
//calling main method
public static void main(String args[])
{
	asciiValue();
}
}