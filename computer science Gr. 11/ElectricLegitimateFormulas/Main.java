import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("String actions");
    Scanner input = new Scanner(System.in);
    String word = "d"; 
    while (word.equals("Quit")== false)
    {
      System.out.println("enter a word and the program will output the length. \n if you want to quit, type (Quit) as shown in betweem the brackets");
      word = input.next();
      if (word.equals("Quit")==true)
      {
        System.out.println("Goodbye");
        break;
      }
      System.out.println(word.length());
    }
  }
}