//Import scanner object for the abilty to create scanner objects and use scanner objects in program
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Guessing game");
    //create a scanner object for obtaining user input data on command
    Scanner input = new Scanner(System.in);
    //format title and heading 
    System.out.println("\t\t\t\t\t WELCOME TO THE GUESSING GAME\n\t\t\t--------------------------------------------");
    //Define a secret number between 1-50 that the user will have to Guess in a variable called secret
    int secret = 12;
    //Define a variable counter called i that count the number of attempts the user take to guess the number which starts at the first attempt
    int i = 1;
    //define a variable that will be used to hold the users guess
    int guess;
    //create a loop which has the user enter in a integer and checks if the integer is not correct to run code again
    do
    {
      //prompt the user to guess a number between 1-50 to be able to collect it and state which attempt they are on.
      System.out.println("Guess a number between 1-50\nattempt "+i);
      //collect data on the number they inputed with the scanner object input and store it in the guess variable to be able to compare it with the secret 
      guess = input.nextInt();
      //check if they guessed the correct value by comparing the value of guess to secret
      if (guess == secret)
      {
        //inform the user that they guessed correctly and the amount of attempts they took
        System.out.println("You guessed the number in "+i+" attempt(s).");
        //end the game by exiting the loop
        break;
      }
      //check if they guessed a value out of the guessing range by checking if value of guess is over 50 or less than 1
      else if (guess >50 || guess <1)
      {
        //inform the user that the inputed value is out of range
        System.out.println("value not in range");
      }
      //check if they guessed too high by comparing if the value of guess is larger than the value of secret
      else if (guess > secret)
      {
        //inform the user they guessed too high
        System.out.println("Your guess is too HIGH");
      }
      //check if the user guessed too low by comparing if the value of guess is larger than the value of secret
      else if (guess < secret)
      {
        //inform the user they guessed too low
        System.out.println("Your guess is too LOW");
      }
      //check if they guessed more than or 5 times to be able to end the game after their 5th attempt
      if(i >= 5)
      {
        //inform the user that the game is over and what the secret number is
        System.out.println("GAME OVER OUT OF GUESSES\nthe secret number was "+secret+" .");
        //exit the loop to end the game and the program 
        break;
      }
      //increase the counter by one to be able to tally the amount of attempts they took
      i++;
    }
    //check if the there guess is not correct 
    while (guess!=secret);
  }
}