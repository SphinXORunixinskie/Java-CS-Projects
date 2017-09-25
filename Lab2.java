import java.util.Scanner;

public class Lab2 {

  public static void main(String[] args) 
  {
// TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in); 

    System.out.println("What letter/phrase would you like to convert");

    char[] symarray = {' ',':',';','.','-', '!','?'}; //created two arrays
    char[] encrypted = {'~','-','^','&','$','(',')'}; //any top symbols will be replaced with these '~' will be replaced with '_'

String str = sc.nextLine(); // getting user input as string


str = str.toLowerCase(); // Since there 2 Values for each number, we make it easier and only deal with lowercase
char [] charArray = str.toCharArray();// To handle each letter, we convert the String into a Array of chars


System.out.println("How many shifts?"); //How many letter shifts does the user want
int shift = sc.nextInt(); // Grabs the integer value

for(int i=0; i<charArray.length;i++) // i has to be less than the length of that array (i is our counter)
{
  int code; //creat another valerable for the numerical chars (asking value of char
code = (int) charArray[i]; // code is equal to the Decimal ASCII Value of each char

if(code>=97 && code<=122){ // Checking if code is within appropriate range
  code = code + shift; //if in approited range code and shift will be added resulting in new char chacter 
  charArray[i] = (char) code;
} 

else //if the user puts in symbol chars then...
{
  //Check Symbol Array for this value
  boolean found = false; //"guilty until proven innocent haha"
  for(int p=0; p<symarray.length;p++)
    //only way to break if you 
    //go all the way to the end or if you set the P value greater than 
   // equal to or greater than length 
  {
    if(charArray[i] == symarray[p]) //only time found will change values is if the character is found ( this is what the, what if, statement is doing)
    {
      charArray[i] = encrypted[p];
      p = symarray.length; 
      found = true; // been proven innocent
    }
  }

  if (found==false){ //and if it didnt find this character set it equal to deafult value
    charArray[i] = '%';
  }
}


if(code>122)//Max value for char Decimal ASCII value, if value went passed 122, we need to revert back to 'a' 
{
  int n;
  n = code - 122; //shift modulae for character if above range 122
  code = 97 + n; //(0+n) 
  charArray[i] = (char) code;
  
}
System.out.print(charArray[i]); // prints array
}
}
}
