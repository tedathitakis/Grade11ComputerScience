
// Ted Athitakis ICS4U1
// My bank machine
// due 20/01/27
//import nessacry reasources
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Character;

//Atm Class
class Atm {
  //create the scanner obj
  static Scanner input = new Scanner(System.in);
  //define variables
  static  String bankName = "ee";
  static private double balance= 89;
  // create atm obj
  Atm(String bankName, double balance) {
    // System.out.print("party");
    this.balance = balance;
    this.bankName = bankName;
  }

  // inputer
  public static double Input(String a) {
    //create boolean errror to remember if an error was inputed
    boolean error = false;
    //create ex to hold inputs
    double ex;
    do {
      //reset error
      error = false;
      //print prompt from called spot
      System.out.print(a);
      //if the input isn't a double data type the program will become an error an will return them to the menu
      try {
        //collect input
        ex = input.nextDouble();
        //check if input is positive amount
        if (ex > 0){
          //return input as everything is in order
          return ex;
          //if less than zero make them respond again by changing the loop condition
        }else{
          System.out.println("input has to be grater than 0");
          error = true;
        }
        //tell them their input is invalid return them to menu
      } catch (Exception e) {
        System.out.println("Invalid input, not a number");
        error = true;
      }
      error = false;
    } while (error == true);
    return 45;
  }

  // depositing method
  public  void deposit() {
    double depositA = Input("input amount you would like to deposit: ");
    this.balance += depositA;
  }
  //withdrawling method
  public void withdrawl(){
    double withdrawlA = Input("input amount you would like to withdrawl: ");
    this.balance -= withdrawlA;
  }
  //displaying balance method
  public void displayBalance() {
    System.out.println("Your balance is $"+this.balance+".");
  }
  //interest method
  public void addInterest() {
    double i = Input("Input the annual interest (without percent sign as a decimal ex: 0.89 is 89%): ");
    double n = Input("Input the amount of days you decide to leave the balance invested: ");
    this.balance = this.balance*Math.pow((1+i),n);
  }
}
//atm playing class
class Main {
  public static void main(String[] args) {
    // create scanner object to collect inputs
    Scanner input = new Scanner(System.in);
    // define variables
    double balance;
    System.out.println("Atm");
    //prompt user to input bank name and collect
    System.out.print("input bank name: ");
    String _input = input.nextLine();
    //prompt user to input balance and collect
    System.out.print("input bank balance: ");
    Double _Input = input.nextDouble();
    //create atm object with parameters above
    Atm atm = new Atm(_input, _Input);
    //create a boolean var to act as a flag holding the if the user wants to exit
    boolean exit = false;
    while (exit == false) {
      //prompt user to pick an action in the atm
      System.out.print("Welcome to " + atm.bankName
          + "\n-----------------------------------------------------------\n choose an action: \n1. exit\n2. deposit money\n3. withdrawl money\n4. display the current balence\n5. add daily interest\n input number beside action: ");
          // switch the different methods that the atm can do
      switch (input.nextInt()) {
      case 1: {
        //exit the program
        System.out.print("Goodbye!");
        System.exit(0);
      }
      case 2: {
        atm.deposit();
        break;
      }
      case 3: {
        atm.withdrawl();
        break;
      }
      case 4: {
        atm.displayBalance();
        break;
      }
      case 5: {
       atm.addInterest();
      }
      break;
      }
    }
  }
}