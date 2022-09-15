/*
@progam :Java progam to find whether the character entered is vowel ,consonant ,number and special character.	
code by : Swapnil
Date : 15sep 2022
*/

//creating class AsciiValue1
class ConsonantDemo
{

	//creating method printAsciiValue
 static void checkChar(char cvalue)
 {
	
	 int asciiVal=cValue;  //computing Ascii value
	 if((asciiVal>=65)&&(asciiVal<=90))
	 {
		 System.out.println("Its a capital (uppercase) letter");
	 if(cValue=='A'||cValue=='E'||cValue=='I'||cValue=='O'||cValue=='U')
		{
			System.out.println("its is vowel");
			
		}
		else
		{
		System.out.println("Its a Consonant");	
		}
	 }
	 else if ((asciiVal>=97)&&(asciiVal<=122))
	 {
		 System.out.println("Its a capital (lowercase) letter");
	 if(cValue=='a'||cValue=='e'||cValue=='i'||cValue=='o'||cValue=='u')
	 {
		 System.out.println("its is vowel");
	 }
	 else
	 {
		System.out.println("Its a Consonant");	
	 }		
	 }
	 else if ((asciiVal>=48)&&(asciiVal<=57))
	 {
		 
		 System.out.println("Its a Number");	
	 }
	 else
		 System.out.println("Its a Special Charatctor");	
		 
 }
		 
	  

 
 
//calling main method
public static void main(String args[])
{
	 char value=args[0].charAt(0);  // taking a character input
	 
     //calling method checkChar  //passing value as a parameter
	
	 checkChar(Value);
}
//end of main
}
