import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("input 4 number with pressing enter between them");
    //create variables to hold all numbers
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    int num4 = input.nextInt();
    //create a variable which will check if a value was changed in the last loop
    boolean i = true;
    //create a variable to hold numbers while switching values between variables
    int hold;
    //create a loop which will compare numbers beside eachother and check if they are higher than eachother and if a latter number is higher, then it will switch the two values. The loop will continue to run until it runs with all numbers in order for highest to lowest
    while (i==true)
    {
      i=false;
      if(num2 > num1)
      {
        //tell the program that a number was changed so the loop can run again to check if there was any other adjacent vars needing to be switched
        i=true;
        hold = num1;
        num1 = num2;
        num2 = hold;
      }
      if(num3 > num2)
      {
        i=true;
        hold = num2;
        num2 = num3;
        num3 = hold;
      }
      if (num4 > num3)
      {
        i=true;
        hold = num3;
        num3 = num4;
        num4 = hold;
      }
    }
    // the highest value should have moved up to num1 and vice versa for num4
    System.out.println(num1+" "+num2+" "+num3+" "+num4);
    System.out.println("highest "+num1);
    System.out.println("Lowest "+num4);
  }
}