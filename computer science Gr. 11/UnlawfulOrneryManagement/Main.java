import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("May 15th challenge");
    Scanner input = new Scanner(System.in);
    System.out.println("input a word");
    String word = input.next();
    //create counter variable i which contains the length of the word -1 to align the length with the possible positions which the .charAt action counts
    int i = word.length()-1;
    int aCount = 0;
    //run a loop for the length of the word allowing an if statement to check each character for the letter a
    for (i=i;i>=0;i--)
    {
      if (word.charAt(i) == 'a' || word.charAt(i) == 'A')
      {
        aCount++;
      }
      //System.out.println(aCount);
      //System.out.println(i);
    }
    System.out.println(aCount);
  }
}