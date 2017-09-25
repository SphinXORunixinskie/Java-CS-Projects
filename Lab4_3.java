import java.util.Scanner;

public class Lab4_3
{
  public static void main (String[] args){
   
    double income = 0;
    Scanner input = new Scanner (System.in);
    
    System.out.println("This program will compute your income tax based on a graduated tax rate scheme."); 
    
    System.out.println("Input Your Income");
    income  = input.nextDouble();//income amount input
    
    System.out.print("This is the amount of taxes you owe: " + (calculateTax(income)) ); //tax you owe
    
  }
  public static String calculateTax(double income) //this method takes the income amount in the main method 
    // it then compares it to a specfic range of numbers then returns a string, my parameter is the double income, linking class string variable 
  {
 String taxRate = "";//initialzing the string 
    if (income < 15000){
      taxRate = "It is 0%"; //prints initialized string 
    }
    else if ( (income >= 15000 )&& (income <= 80000)){
      taxRate = "15% on earnings over $15,000, 0% tax onthe first $15,000 earned";
    }
 else if ((income > 80000 )&& (income <= 200000)){
      taxRate = "25% on earnings over $80,000";
    } 
 else if (income >  200000){
      taxRate = " 75% on earnings over $200,000";
   }
 return taxRate;
  }
}