import java.util.Scanner;
import java.util.Random; 
public class Lab4_1{     
  
  public static void main(String[] args){
  
    int columns= 0; 
    int rows= 0; 
    int i = 0; //rows
    int j = 0; //cols
    double average= 0; 
    double sum= 0;
    
    Scanner input = new Scanner(System.in); 

    System.out.println("Input number of cols"); 
    columns = input.nextInt(); 
    
    System.out.println("Input number of rows");
    rows = input.nextInt(); 
    
    double[][] orginal = new double[columns][rows];
    Random gen = new Random();
    
    for( i = 0; i <rows; i++){
      for(j = 0; j < columns; j++){
         orginal[i][j] = gen.nextInt(9)+1; 
         System.out.println(orginal[i][j]);
      }
    }
    for(i = 0; i <rows; i++){ 
      for (j = 0; j < columns; j++){ 
        //Top left Corner of cell 
        if((i==0 && j==0)){
          //Neighbors
          //     center cell      right cell       bottom cell
          sum= orginal[i][j] + orginal[i][j+1]+ orginal[i+1][j];
          average = sum/3;
          System.out.println(average + " Top Right Corner Average"); 
        }
        //Top Right
        else if((i == 0 && j == columns-1)){
          //Neighbors
          //     center cell      left cell       bottom cell
          sum= orginal[i][j] + orginal[i][j-1]+ orginal[i+1][j]; // J IS COLS
          average = sum/3;
          System.out.println(average + " Top Right Corner Average"); 
        }
        //Bottom Right Corner 
        else if (i == (rows-1) && (j == (columns-1))){ 
           //Neighbors 
           //    top cell          left cell      center cell
          sum= orginal[i-1][j] + orginal[i][j-1] + orginal[i][j]; 
          average= sum/3; 
          System.out.println(average + " Bottom Right Corner average"); 
        }
        //Bottom left Corner 
        else if ((i == (rows-1) && (j == 0))){ 
           //Neighbors 
           //    top cell          right cell      center cell
          sum= orginal[i-1][j] + orginal[i][j+1] + orginal[i][j]; //youll never add one or minus one to i and j cols go up and down
          average= sum/3; 
          System.out.println(average + " Bottom Left Corner average"); 
        }
        //Right Wall
        else if ((i != 0 && i !=rows-1) && j == columns-1){ 
          // Neigbors 
          //      top  cell         bottom  cell     left cell    center cell
          sum= orginal[i-1][j] + orginal[i+1][j] + orginal[i][j-1]+ orginal[i][j]; 
          average= sum/4; 
          System.out.println(average + " Right Wall Average"); 
        }
        //Left Wall
        else if ((i != 0 && i != rows-1) && (j == 0)){ 
          // Neigbors 
          //      top  cell         bottom  cell     right cell    center cell
          sum= orginal[i-1][j] + orginal[i+1][j] + orginal[i][j+1]+ orginal[i][j]; 
          average= sum/4; 
          System.out.println(average + " Left Wall Average"); 
        }
        //Top Row
        else if (i == 0 && j != 0 && j != columns-1){ 
          // Neigbors 
          //      left cell        bottom  cell      center cell
          sum= orginal[i][j-1] + orginal[i+1][j]+ orginal[i][j]; //i is rows
          average= sum/3; 
          System.out.println(average + " Top Row Average"); 
        }
           //Bottom Row
        else if (i == columns-1 && j != 0 && j != columns-1){ 
          // Neigbors 
          //      left cell        top  cell      center cell
          sum= orginal[i][j-1] + orginal[i-1][j]+ orginal[i][j]; //i is rows
          average= sum/3; 
          System.out.println(average + " Bottom Row Average"); 
        }
        else{
         sum = orginal[i-1][j] + orginal[i+1][j] + orginal[i][j+1] + orginal[i][j-1] + orginal[i][j];
         average= sum/5; 
           System.out.println(average + "Center cells average"); 
        }
  }
    }
    }
}