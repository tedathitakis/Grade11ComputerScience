// Ted Athitakis  ICS4U1  Due: 14/01/2021
//Purpose: create a tax calc
//import needed resources
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //define variables to be used
    Scanner input = new Scanner(System.in);
    //provincial tax calculator
    //define variable to hold the amount of % of income needed to be deducted
    double tax40000 = 0;
    double tax80000 = 0;
    double tax510000 = 0;
    //prompt user to input salary
    System.out.print("Input salary: ");
    //store salary in variable
    double salary = input.nextDouble();
    //check if they have been assigned a tax
    while (tax40000 == 0)
    {
      //check which tax bracket they are in
      if (salary < 0)
      {
        //prompt user to input a valid input
        System.out.print("Please input valid amount: ");
        //store input in salary
        salary = input.nextDouble();
      }
      else if (salary <= 40000.00)
      {
        //calculate tax
        tax40000 = salary*0.0505;
      }
     else if (salary <= 80000.00)
      {
        //calculate tax for first income
        tax40000 = 40000*0.0505;
        //calculate tax for next income
        tax80000 = (salary-40000)*0.0915;
      }
     else if (salary <= 510000)
      {
        //calculate tax for first income
        tax40000 = 40000*0.0505;
        //calculate tax for next income
        tax80000 = 40000*0.0915;
        //calculate tax for next income
        tax510000 = (salary-80000)*0.1116;
      }
      else
      {
       //prompt user to input a valid input
       System.out.print("Please input valid amount: ");
       //store input in salary
       salary = input.nextDouble();
      }
    }
    //print out statement with tax
    System.out.print("The tax is $"+Main.addition(tax40000,tax510000,tax80000));
  }
  //method for adding up tax
  public static double addition(double a, double b, double c)
  {
    //add
    double addition = a+b+c;
    //return sum to string
    return addition;
  }
}