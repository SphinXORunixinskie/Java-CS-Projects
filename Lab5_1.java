import java.util.Scanner;
import java.util.Random;
 
public class Lab5_1 //*Our class 
  /*This is a class that uses muplitple methods to shuffle a list of a certain number of values inputed by user
   *it gives the values in the array order, prints the evens values of the array list, shuffles the array list randomly*/
{
public static void main(String[] args) //our main method 
{
int max = 100;
Scanner input = new Scanner(System.in);

System.out.print("How many numbers should the list have?");
int arraySize = input.nextInt();
 
/* 0. create an array with arraySize number of elements in it*/
int [] list = new int[arraySize];
 
putRandomValues(list, max);
System.out.println("Here are some random values in the list: ");
 
printArray(list);
System.out.println("The list contains " + countEven(list) + " even numbers.");
 
reverseArray(list);
System.out.println("The list in reverse order: ");
 
printArray(list);
shuffle(list);
System.out.println("Array is now shuffled.");
 
printArray(list);
}

/*1. This method prints the array elements on the same line, separated by a space.
 * @param in array*/

public static void printArray(int[] array){
  for (int i =0; i < array.length; i++){
    System.out.print(array[i] + " ");
  }
   System.out.println(" ");
}

 /*  2.  A seperate method that creates random integers from 0-100, once you make changes to the array its reflected back 
    *into the main method, hence you no need no return
    *@param in array and max value */

public static void putRandomValues(int[] array, int max){
  Random gen = new Random();
   for (int i = 0; i < array.length; i++){
        array[i] = gen.nextInt(max)+1;
    }
}

/* 3. Method counts the even numbers in the array by using a modulus to define if it divids evenly
 * @param in array
 * @returns numEven*/ 

 public static int countEven(int[] array){
   int numEven = 0;
   for (int i = 1; i <array.length; i++){
     if ( array[i]%2==0){
        numEven = 1 + numEven; //counting here 
      }
    }
return numEven; //returns output 
}

/*4) *This method reverses the array list by using a temp varaiable, swaping values until there is nothing elese to be swampped
     *@param in array
     * not returning anything because we are changing the array*/

 public static void reverseArray(int[] array){
    int a = array.length-1;
   
    for(int i=0; i <=(array.length/2)-1; i++){
      int temp= array[i];
      array[i]=array[a];
      array[a]= temp;
      a--; //counting down
    }
}

/* 5)* This array shuffles the values through the array 5 times  
     * @ param in array*/

public static void shuffle(int[] array){
  Random gen = new Random();
  int temp;
  int index1=0;
  int index2=0;
   
    for (int i = 0; i < array.length * 5; i++){
      index1 = gen.nextInt(array.length); //state indexes to be randomized/shuffle length of array is limit of random gen 
      index2 = gen.nextInt(array.length); 
      //swap array value 
      temp = array [index1];
      array [index1]= array[index2];
      array[index2]=temp;
    }
}
}