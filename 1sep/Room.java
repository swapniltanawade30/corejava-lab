/*
Program :  Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the member functions are setdata and displaydata.
code by : Swapnil
Date :01 September 2022
*/


// creating class room
class Room
{
	// instance variable
  private int roomNo;  
  private String roomType;
  private Double roomArea;
  private Boolean acMachine;
  
  //creating method to set data
void setData( int rmno, String rmtype, Double rmarea, Boolean acmac)
{
  roomNo = rmno;
  roomType = rmtype;
  roomArea = rmarea;
  acMachine = acmac;
}
// creating method to display details
void displayData()
 {
    System.out.println("room no. is:" +roomNo);
   System.out.println("room type is:" +roomType);
   System.out.println("room area is:" +roomArea);
   System.out.println("Ac machine is:" +acMachine);
 }
 //calling main method
 public static void main(String...args)
 {
	 //creating an object
   Room f1 = new Room();
   f1.setData(130, "Double", 260.0, true);
   f1.displayData();
   
 }
} //end code