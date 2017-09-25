import java.util.Random;
import java.awt.Color; 
import java.util.Scanner; 

public class Lab1_1
{
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    int numCol;
    int numRow;
    
    
    
    System.out.println("Please put number of coloums"); 
    numCol = scnr.nextInt();
    
    System.out.print("Please put number of rows"); 
    numRow = scnr.nextInt();
    {
      
      Board b = new Board ( numCol , numRow);
      Random gen = new Random(); 
      
       //int x = gen.nextInt(numCol);
       //int y = gen.nextInt(numRow);
     int x = 0;
     int y=0;
      
      while (y < numCol)
      {
        b.fillCell(0, y, Color.pink);
        b.fillCell(numRow-1, y, Color.pink);
        b.pause (300); 
        y++;
      }
         while (x < numRow)
      {
       b.fillCell(x, 0, Color.pink);
        b.fillCell(x,numRow-1, Color.pink);
        b.pause (300); 
        x++;
      }
         
    //colorrandomcell(b, gen);
    }
    
  }}
