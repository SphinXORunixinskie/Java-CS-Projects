
import java.awt.Color; 
import java.util.Scanner; 

// only works for 10x10 
public class Midterm 
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
      
      for (int y = 0; y < numRow;)
      {
        b.fillCell(0, y, Color.red);
        b.fillCell(numRow-1, y, Color.red);
        b.pause (300); 
        y++;
      }
       for (int y = 0; y < numRow;)
      {
        b.fillCell(1, y, Color.white);
        b.fillCell(numRow-1, y, Color.white);
        b.pause (300); 
        y++;
      }
        for (int y = 0; y < numRow;)
      {
        b.fillCell(2, y, Color.red);
        b.fillCell(numRow-1, y, Color.red);
        b.pause (300); 
        y++;
      }
        
          for (int y = 0; y < numRow;)
      {
        b.fillCell(3, y, Color.white);
        b.fillCell(numRow-1, y, Color.white);
        b.pause (300); 
        y++;
      }
          
            for (int y = 0; y < numRow;)
      {
        b.fillCell(4, y, Color.red);
        b.fillCell(numRow-1, y, Color.red);
        b.pause (300); 
        y++;
      }
        for (int y = 0; y < numRow;)
      {
        b.fillCell(5, y, Color.white);
        b.fillCell(numRow-1, y, Color.white);
        b.pause (300); 
        y++;
      }
        for (int y = 0; y < numRow;)
      {
        b.fillCell(6, y, Color.red);
        b.fillCell(numRow-1, y, Color.red);
        b.pause (300); 
        y++;
      }
           for (int y = 0; y < numRow;)
      {
        b.fillCell(7, y, Color.white);
        b.fillCell(numRow-1, y, Color.white);
        b.pause (300); 
       y++;
      }
         for (int y = 0; y < numRow;)
      {
        b.fillCell(8, y, Color.red);
        b.fillCell(numRow-1, y, Color.white);
        b.pause (300); 
       y++;
      }
// It only works for a 10x10 
    }
    
  }}
