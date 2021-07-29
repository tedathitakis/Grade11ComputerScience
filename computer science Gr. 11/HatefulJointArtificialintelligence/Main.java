import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Learning about characters");
    Scanner input = new Scanner(System.in);
    // prompt the user to input a word
    System.out.println("input a word and press enter");
    String word = input.next();
    //create a int variable that will hold the the length of word subtracted by one to account for how positions start at zero in java but lengths start at 1 
    int GreatestCharPos = word.length()-1;
    //create a for loop which will run the same amount of times as the length of the word a print out the letter in the counter's current position
    for (int i=0; i<=GreatestCharPos;i++)
    {
      System.out.println(word.charAt(i));
      
    }
    //create a for loop that runs for the same amount of time as the length of the word and have the counter start at the length and have the counter decrease to zero to print the word backwards
    for (int i=GreatestCharPos;i>=0;i--)
    {
      System.out.print(word.charAt(i));
    }
  }
}