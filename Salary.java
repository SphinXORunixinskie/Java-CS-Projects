import java.util.Scanner;
public class Salary {                         

   public static void main (String [] args) { 
      double hourlyWage;     
      double hoursPerweek; 
      double numWeek;
      
      Scanner input = new Scanner(System.in);
                   
      System.out.print("How many weeks do you work per year?");     
      numWeek = input.nextDouble(); 
      
      System.out.print("How many hours do you work per week?");     
      hoursPerweek = input.nextDouble();
      
      System.out.print("What is your hourly wage?");     
      hourlyWage = input.nextDouble();
     
      System.out.print("Montly salary is: " + ((hourlyWage + hoursPerweek + numWeek)/ 12));

                         
      // FIXME: The above is wrong. Change the 1 so the statement prints monthly salary.

      return;
   } 
}




