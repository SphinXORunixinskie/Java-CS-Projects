import java.util.Scanner;
import java.awt.Color;

  public class Lab3_2{
  public static void main(String[] args){
    int numCols;
    int numRows;
    
    //Input Board Dimension
    Scanner input = new Scanner(System.in); //user input for cols
    System.out.println("Please input number of cols");
    numCols = input.nextInt(); 
    
    System.out.println("Please input number of rows"); //user input for rows
    numRows = input.nextInt(); 
   
    int x = 0, y = 0, i = 0;
    Color[] colorChoice = {Color.red, Color.green, Color.blue}; //color array 
        
    System.out.println("Please chose color 1 for red, 2 for green, 3 for blue for cols"); //users input for color on cols
    int colorcols = input.nextInt(); 
      
    System.out.println("Please chose color 1 for red, 2 for green, 3 for blue for rows");//users input for color on rows
    int colorrows = input.nextInt(); 
    
    Board b = new Board(numCols, numRows); //board varaibles 
    
    for (y = 0; y < numCols; y++){
      for(x = 0; x < numRows; x++){
          for(i = 0; i <= x; i++){
            if((x == y) && (x - 1 >= -1)){
              b.fillCell(x - i, y, colorChoice[colorcols-1]); //accomdation for users specfic color input through array
          }
        }
      }
    }
    for (y = (numRows - 1); y > 0; y--){
      for(x = (numCols - 1); x > 0; x--){
          for(i = 0; i <= numCols; i++){
            if((x == y) && (x + i < numRows)){
              b.fillCell(x + i, (y - 1), colorChoice[colorrows-1]); //accomdation for users specfic color input 
          }
        }
      }
    }
  }
}