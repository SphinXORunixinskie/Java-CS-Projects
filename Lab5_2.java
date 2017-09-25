import java.util.Scanner;

public class Lab5_2{//This is a class that has privite classes with static methods and we change the intergers throughout the class with methods
  public static void main(String[] args){
    int inputNumber = 0;
    
   Scanner input = new Scanner(System.in);
    
CellCarrier c1 = new CellCarrier(); //making object
 c1.print();
 
CellCarrier c2 = new CellCarrier(); //making object
   System.out.println("Please input your phone number: ");
   inputNumber = input.nextInt();
   c2.setNumber(inputNumber); //stores number and plugs into method inside the class cell carrier  
   c2.print();
}
}
class CellCarrier{
 String cellCarrier = " "; //initlizing intergers 
 int monthlyCost = 0  ;
 int phoneNumber = 0  ;

  public String getCarrier(){ //returning users input
   return cellCarrier;
}
  public int getCost(){ //returning cost of monthly plan
   return monthlyCost;
 } 
  public int getNumber(){ //returning users phonenumber
    return phoneNumber;
}
  public void setCarier(String carrier){//grabs strings of what ever carrier the user inputs
   cellCarrier = carrier;
  }
  public void setCost(int cost){ //setting the cost 
   monthlyCost = cost;
}
  public void setNumber(int number){ //setting phone number 
 phoneNumber = number;
 }
  
public void print(){ //printing out all the information the system outputted 
 System.out.println("Carrier: " + cellCarrier + " | Monthly Cost: " + monthlyCost + " | Phone Number: " + phoneNumber);
    System.out.println();
}
  public CellCarrier(String carrier, int cost, int number){//setting the parameters for the class 
 cellCarrier = carrier;
  monthlyCost = cost;
    phoneNumber = number;
  }
public CellCarrier(){ //default method 
 cellCarrier = "Verizon";
   monthlyCost = 120        ;
    phoneNumber = 2033332902;
  }

}

    