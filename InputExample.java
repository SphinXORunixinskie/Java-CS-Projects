import java.util.Scanner;

public class InputExample {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      double foot;
      double inches;
      double total;
      
      System.out.println("Please input the");
      System.out.println("How many feet?");
      foot = scnr.nextDouble();
      
      
      System.out.println("How many inches?");
      inches = scnr.nextDouble();
      
   System.out.print ( foot + " feet and ");
   foot = (foot * 12.0);
   total = (foot+inches) * 2.54;
   System.out.println(inches + " inches are equivalent to" + total + " cms");
   
      return;
   }
}