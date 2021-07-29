// Ted Athitakis  ICS4U1  Due: 08/01/2021
//Purpose: create an easter calculator
//import need resources
import java.lang.Math;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //create scanner object to accept inputs
    Scanner input = new Scanner(System.in);
    System.out.print("Easter Calculator.\n input year to figure out what day easter falls on.\nInput: ");
    //collect input
    int year = input.nextInt();
    //declare variables needed to process calculation
    int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q;
    int month, day;
    //declare variable which will hold the text of the correct month
    String monthS;
  //preform multi step calculation from the worksheet
    a = year/100;
    b = year%100;
    c = 3*(a+25)/4;
    d = 3*(a+25)%4;
    q = (8*(a+11))/25;
    f = (5*a+b)%19;
    g = ((19*f)+c-q)%30;
    h = (f+11*g)/319;
    j = (60*(5-d)+b)/4;
    k = (60*(5-d)+b)%4;
    n = (2*j-k-g+h)%7;
    month = (g-h+n+114)/31;
    p = (g-h+n+114)%31;
    day = (p+1)/1;
    //check which month easter falls on and put it in the variable to be outputed
    if (month == 3)
    {
      monthS = "March";
    }
    else
    {
      monthS = "April";
    }
    //output the date of easter
    System.out.println("Easter is on "+ monthS+ " "+ day+ " in the year "+ year);
  }
}