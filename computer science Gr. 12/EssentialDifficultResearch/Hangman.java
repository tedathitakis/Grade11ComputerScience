
// Ted Athitakis ICS4U1
// hangman
// due 20/01/27
//import nessacry reasources
//To Do: mark completion and gameover, change to string builder
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Character;

class Main {
  public static void main(String[] args) {
    System.out.println("hangman");
    // define variables
    // create objects
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    // create a variable for defining number of tries left
    int tries = 6;
    // create guess variable to hold guess
    char guess;
    // create string variant of guess
    String guessS;
    // create ignore boolean
    boolean ignore = false;
    // create word bank
    // catagories 1=animals 2= jobs 3= colours 4 = cities 5 = fruits and vegetable
    String[][] wordBank = {
        { "cat", "tarantula", "chimpanzee", "chinchilla", "dolphin", "grasshopper", "hippopotamus", "pheasant",
            "spoonbill", "salamander" },
        { "scientist", "engineer", "police officer", "firefighter", "politician", "mechanic", "contruction Worker",
            "doctor", "orthodontist", "gold miner" },
        { "turquoise", "burgundy", "aquamarine", "magenta", "amaranth", "beige", "indigo", "mauve", "periwinkle",
            "sangira" },
        { "chongqing", "buenos aires", "bangalore", "hyderabad", "johannesburg", "khartoum", "alexandria",
            "guadalajara", "rio de janeiro", "saint petersburg" },
        { "watermelon radish", "cucamelons", "cherimoya", "calamondin", "atemoya", "canistel", "fiddleheads",
            "jabuticaba", "kohlrabi", "monstera deliciosa" } };
    //select a random catagory and store it in a variable
    int catagory = random.nextInt(5);
    //choose a word from the word bank and store it a variable for ease of access
    String word = wordBank[(catagory)][random.nextInt(10)];
    //create a version of the word which will replace all of the letters with dashes
    String hiddenWord = "";
    for (int i = 0; i < (word).length(); i++) {
      if (i == 0) {
        hiddenWord = "-";
      } else if (word.charAt(i) == ' ') {
        hiddenWord += " ";
      } else {
        hiddenWord += "-";
      }
    }
    //create a string builder which will allow for easy switching of dashes from the hidden word into letters
    StringBuilder sb = new StringBuilder(hiddenWord);
    //while the user has tries remaining, continue playing
    while (tries >= 0) {
      //display catagory
      switch (catagory) {
      case 0: {
        System.out.println("Catagory: ANIMALS");
        break;
      }
      case 1: {
        System.out.println("Catagory: JOBS");
        break;
      }
      case 2: {
        System.out.println("Catagory: COLOURS");
        break;
      }
      case 3: {
        System.out.println("Catagory: BIG CITIES");
        break;
      }
      case 4: {
        System.out.println("Catagory: EXOTIC FRUITS");
        break;
      }
      }
      //display the hidden word with all letters guessed placed inside
      System.out.println(hiddenWord);
      //display the hanging man which represents the tries remaining
      switch (tries) {
      case 6: {
        System.out.println("");
        break;
      }
      case 5: {
        System.out.println("\tO");
        break;
      }
      case 4: {
        System.out.println("\tO\n\t|\n\t|");
        break;
      }
      case 3: {
        System.out.println("\tO\n   \\|\n\t|");
        break;
      }
      case 2: {
        System.out.println("\tO\n   \\|/\n\t|");
        break;
      }
      case 1: {
        System.out.println("\tO\n   \\|/\n\t|\n   /");
        break;
      }
      case 0: {
        System.out.println("\tO\n   \\|/\n\t|\n   / \\");
        break;
      }
      }
      //prompt the user to input a letter
      System.out.print("Guess a letter: ");
      //collect user input
      guess = input.next().toLowerCase().charAt(0);
      //run a loop to compare every character to find a match to the letter inputed
      for (int i = 0; i < (word).length(); i++) {
        //if a match is found then replace the letter into the hidden string
        if (guess == (word).charAt(i) && Character.isLetter(guess)) {
          guessS = String.valueOf(guess);
          sb.replace(i, i + 1, guessS);
          hiddenWord = sb.toString();
          //ignore fail coundition
          ignore = true;
        }/*if a match is isn't found than reduce the users tries*/ else if (i == (word).length() - 1 && ignore == false) {
          System.out.println(guess + " is not a letter");
          tries--;
        }
      }
      //reset the ignore command after comparison loop
      ignore = false;
      //check if word is completed, inform the user of their victory, and end the program
      if (hiddenWord.equals(word)) {
        System.out.println(hiddenWord+"\nYou are a Hangman master!");
        break;
        //if they ran out of tries inform them of their loss
      } else if (tries <= 0) {
        System.out.println("You lose!");
      }
    }

  }
}