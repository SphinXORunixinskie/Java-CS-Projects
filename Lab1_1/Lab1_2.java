import java.util.Random;
import java.awt.Color; 

public class Lab1_2
{
  public static void main(String[] args)
  {
    Board b = new Board (15,15);
    Random gen = new Random(); 
    
    
    for (int count = 1; count <= 15; count++)
    {
    int x = gen.nextInt(15);
    int y = gen.nextInt(15); 
 
   
    b.fillCell(y,y, Color.pink); 
    b.fillCell(x,x, Color.blue);
    b.setChar(1, 1, 'x');
    
    if (x <= 15) 
   {
   b.setChar(1, 1, 'x');
   } 
   else if (x > 15) 
   {
     b.setChar(1, 1, 'y');
  }
    }
}
} 