import java.util.Scanner;

public class Lab3_1 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  // arrays
  final int DAYS_WEEK = 7;
  double maxMPH = 0;
  double minMPH = 0;
  double avgMPH = 0;

  
  double totalMPH = 0; // Added in so that you can calc the avg time. avg = total/#
  int counter = 0; // added so that you can check how many days are more than 0

  String[] dayzWeek = { "Monday", "Tuesday", "Wednesday", "Thursday",
    "Friday", "Saturday", "Sunday" };

  double[] runTime = new double[DAYS_WEEK];
  double[] distanceRan = new double[DAYS_WEEK];
  double[] milesPerhour = new double[DAYS_WEEK];

  Scanner input = new Scanner(System.in);
  // inputing run time and distance
  for (int i = 0; i < DAYS_WEEK; i++) {
   System.out.println("Enter run time for " + dayzWeek[i] + ": ");
   runTime[i] = input.nextDouble();

   while (runTime[i] < 0) {
    System.out.println("Wrong Value");
    runTime[i] = input.nextDouble();
   }

   System.out.print("Please enter the distance you have ran "
     + dayzWeek[i] + ":");
   distanceRan[i] = input.nextDouble();

   while (distanceRan[i] < 0) {
    System.out.println("Wrong Value");
    distanceRan[i] = input.nextDouble();
   }
  }

  // calculations for miles per hour
  for (int i = 0; i < DAYS_WEEK; i++) {
   runTime[i] = runTime[i] / 60;
   milesPerhour[i] = distanceRan[i] / runTime[i];
   System.out.println(milesPerhour[i]);
  }
  
  minMPH = milesPerhour[0]; // Need to set Min to first element of array, otherwise will always be 0 from initialization
  
  for (int i = 0; i < DAYS_WEEK; i++) {
   
   if (milesPerhour[i] > maxMPH) { //Calc Max
    maxMPH = milesPerhour[i];
   }
   if(milesPerhour[i] < minMPH) //Calc Min
   {
    minMPH = milesPerhour[i];
   }
   if(Math.abs(milesPerhour[i]) > 0.0001) // IF val of index i is greater than zero
   {
    counter = counter +1; // Add it to number of days that user did not rest
    totalMPH = totalMPH + milesPerhour[i]; // running total, simply adds all vals in array
   }
  }
  avgMPH = totalMPH/counter;//Take total and subtract it by the number of days of NO rest!
  
  System.out.println("\n" + maxMPH); // New line, then print
  System.out.println(minMPH);//print
  System.out.println(avgMPH);//print
 }
}
