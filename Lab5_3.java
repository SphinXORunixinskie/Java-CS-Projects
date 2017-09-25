import java.util.Scanner;
import java.awt.Color;
import java.util.Random;
 
public class Lab5_3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
     
    int rows = 50;
    int cols = 50;
    int cOrigin = cols / 2;
    int rOrigin = rows / 2;
    int radius = Math.min(cols, rows) / 3;
     
    animation(rows, cols, cOrigin, rOrigin, radius); //linking class 
  }
  /* This method performs the animation operations and fills the left
   * over cells in random color each time the program is rerun 
   * @param rows 50
   * @param cols 50
   * @param part of cOrgin  
   * @param part of rOrgin 
   * @param part of radius
   * */
  public static void animation(int rows, int cols, int cOrigin, int rOrigin, int radius){
    Random gen = new Random();
    Color color1 = new Color (gen.nextInt(255), gen.nextInt(255), gen.nextInt(255));//color object
     
    Board b = new Board(cols, rows);
     
    for (int r = 0; r < rows; r++){
      for (int c = 0; c < cols; c++){
        if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius,2)){
          b.fillCell(c, r, Color.white);
          if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius-radius/4,2)){
            b.fillCell(c, r, Color.black);
            if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius-radius/3,2)){
              b.fillCell(c, r, Color.white); 
             if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius-radius/2,2)){
              b.fillCell(c, r, Color.black);
             if (Math.pow(r-rOrigin,2) + Math.pow(c-cOrigin,2) <= Math.pow(radius-radius/1.5,2)){
              b.fillCell(c, r, Color.white);
             }
            }
           }
          }
        }
        else
        {
          b.fillCell(c, r, color1); //randomized color left over cells 
        }
      }
      b.pause(100);
    }
  }}
