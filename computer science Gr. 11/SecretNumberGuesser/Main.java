//import scanner
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class Main {
  public static void main(String[] args) {
    System.out.println("Secret number guesser");
    int i = 0;
    int secretNumber = 3;
    //create scanner object
    Scanner input = new Scanner(System.in);
    //prompt user to Guess a number between one and ten
    System.out.println("Guess a number between one and ten.");
    int Guess = input.nextInt();
    while (Guess != secretNumber)
    {
      i++;
      if (Guess > 10 || Guess < 1)
      {
        System.out.println("Try a number between 1 and 10 and Guess again, Guess Count "+i);
      }
      else
      {
        System.out.println("Try again, Guess count "+i);
      }
      Guess = input.nextInt();
    }
    i++;
    System.out.println("You guessed right in "+i+" attempts!");
  }
}