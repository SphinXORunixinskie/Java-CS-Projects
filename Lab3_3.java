// This program draws a red circle inside a board
// object and fills the remaining cells green.  

import java.util.Scanner;
import java.awt.Color;

public class DrawCirclelaber
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    // obtain the number of rows and columns
    System.out.print("Input number of rows: ");
    int rows = input.nextInt();
    
    System.out.print("Input number of columns: ");
    int cols = input.nextInt();
    
    // Create the board
    Board b = new Board(cols, rows);
    
    // the row and column coordinates of the 
    // circle origin are the middle cell of the board
    int cOrigin = cols / 2;
    int rOrigin = rows / 2;
    
    // the radius is 1/3 the length of the smallest side
    int radius = Math.min(cols, rows) / 3;
    
    // Consider every cell in the board
    System.out.println("radius is : " +radius);
    System.out.println("rOrigin is: "+rOrigin);
    System.out.println("cOrigin is: "+cOrigin);
    for (int r = 0; r < rows; r++)
    {
      for (int c = 0; c < cols; c++)
      {
        // if a cell coordinate falls inside the circle,
        // then color it red
        if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius,2))
        {
          b.fillCell(c, r, Color.red);
          if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius-radius/4,2)){
            b.fillCell(c, r, Color.white);
            if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius-radius/3,2)){
              b.fillCell(c, r, Color.red);
               if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius-radius/2,2)){
              b.fillCell(c, r, Color.white);
                if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius-radius/1.5,2)){
              b.fillCell(c, r, Color.red);
            }
            }
            }
          }
        }
        else // outside the circle
        {
          b.fillCell(c, r, Color.white);
        }
      }
      // pause after filling each row
      b.pause(100);
    }
  }
}