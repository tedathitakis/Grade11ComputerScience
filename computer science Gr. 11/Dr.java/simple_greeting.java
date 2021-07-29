//We must import the Scanner class before use
import java.util.Scanner;

public class simple_greeting
{
  public static void main(String [] args)
  {
    //Creating a Scanner object called input
    Scanner input = new Scanner(System.in);
    
    //Asking the user their name
    System.out.println("What is your name?");
    
    //User input is stored in variable called name
    String name = input.next();
    
    //Greet the user by joining Hello and the variable
    //stored in name
    System.out.println("Hello "+name+"!");
    
  }
}