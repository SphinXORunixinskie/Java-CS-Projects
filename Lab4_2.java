import java.util.Scanner;
 
public class Lab4_2{
  
  public static void main(String[] args){
   
    Scanner input = new Scanner (System.in);
    
    double inches = 0;
    double feet = 0;
    double yards = 0;
     
     System.out.println("Input number of inches: ");
    inches = input.nextDouble();
       System.out.println(inches); 
      
     System.out.println("Input number of feet: ");
    feet = input.nextDouble();
       System.out.println(feet);
    
    System.out.println("Input number of yard: ");
    yards = input.nextDouble();
       System.out.println(yards); 
    
    System.out.println(inches +" inches " + feet + " feet " + yards + " yards.");  
    
convert(inches,feet,yards);//linking class
  
  }
   //convertion process 
  public static void convert(double inches, double feet, double yards){
    final int InchYards = 36;
      final int InchFeets = 12;
      double total= ((yards/ InchYards)+ (feet/ InchFeets) + inches); 
 
      System.out.print("After your convertion: you have " + total + " Inches ");
}
}
