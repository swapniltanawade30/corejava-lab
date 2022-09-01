/*
Program :  Create a class named 'Rectangle' with two data members- length and breadth and a function to calculate the area which is 'length*breadth'. The class has three constructors which are :
code by : Swapnil
Date :01 September 2022
*/
// creating class 
class Rectangle
{
   private int length;
    private int breadth;
    Rectangle() // creating constructor having no parameter 
    {
        length=0;
        breadth=0;  
    }
    Rectangle(int l, int b) // creating constructor with two parameter
    {
        length=l;
        breadth=b;  
    }
    Rectangle(int n) // creating constructor with only one parameter
    {
        length=n;
        breadth=n;  
    }
	//creating method to calculate ractangle area
    void calculate()
    {
        System.out.println("The area of a Rectangle is : "+ (length*breadth));
    }
	//calling main method
    public static void main(String ...args)
    {
		//creating instance of ractangle class
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(7,7);
        Rectangle R3 = new Rectangle(8);
		
		//calling calculate
        R1.calculate(); 
        R2.calculate();
        R3.calculate();
    }    
}//end code