//import nessary utilities.
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Culminating Performance Task- Class List");
    //create a scanner object called input which will collect all inputed data.
    Scanner input = new Scanner(System.in);
    //create an empty array called student which will hold all student names.
    String [] student = new String [5];
    //create an empty array called number which will hold all of the student's numbers.
    String [] number = new String [5];
    //create a loop which will prompt the user to input a students name and input the students number afterwards
      //create counter varible i which starts at 0 and end at 4 to coincide with the arrays' positioning.
    for (int i = 0; i<5;i++)
    { 
      //prompt the user to input the students name
      System.out.println("input student "+(i+1)+"'s name.");
      //collect the name of the student using scanner obj "input" and store the name in the array "student" in the position currently held by the variable "i".
      student[i] = input.nextLine();
      //prompt the user to input the previous student's number.
      System.out.println("input student "+(i+1)+"'s number.");
      //collect the number of the student using the scanner "input" and store the number in the array "number" in the position currently held by i.
      number[i] = input.nextLine();
    }
    //alert the user that the program will now search the students' number up.
    System.out.println("Student number look up\n(if you want to quit input space 5 times and click enter\n Ex.\"     \")");
    //create a string variable called query which will hold the search query inputed.
    String query;
    //create a boolean called j which will allow the loop to run indefinitely.
    boolean j = false;
    //create a variable called "conformed" which will hold a version the value in the position of "i" in the array "student" that is conformed to be only lowercase and without any trailing spaces.
    String conformed;
    //create a loop which will run indefinitely unless broken by a user command.
    while (j == false)
    {
      //format header and prompt the user to input a student's name or enter the exit command.
      System.out.println("\n===========================\nEnter student to look up or enter exit command.");
      //collect the inputed search query or command using the scanner obj "input" and store it in the variable "query".
      query = input.nextLine();
      //check if the user wanted to quit by entering 5 spaces.
      if (query.equals("     ") == true)
      {
        //exit the loop which will end the program as the exit command was entered.
        System.out.println("Goodbye.");
        break;
      }
      //conform the search query to only lowercase and remove the trailing spaces to make the query less case sensitive to match with each students names as their names will also be conformed when comparing
      query = query.toLowerCase().trim();
      //create a loop that will compare each search query to each students name.
      for (int i=0;i<5;i++)
      {
        //change the variable conformed to the current value of the "student" array at position "i" and conform the value to only lowercase and trim the trailing spaces afterwards to make comparing the search query to each students name easier and less case sensitive.
        conformed = student[i].toLowerCase().trim();
        //check if the query entered is equal to the conformed version of the students name.
        if (query.equals(conformed)==true)
        {
          //if it true, display the student's name and its number that the search query was compared against then leave the loop to return back to the beginning of the search function.
          System.out.println(student[i].trim()+" has the student number: "+number[i]);
          break;
        }
        //after each students name has been checked and none have match the query represented when "i" is in the final position (4) and has already checked the last name in the array "student" display that no student matches the search.
        else if (i == 4)
        {
          System.out.println("No student found!");
        }
      }
    }
  }
}