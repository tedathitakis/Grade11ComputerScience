import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("May First challenge");
    Scanner input = new Scanner(System.in);
    //n will represent the base number and will be multiplied by ten and added to the total for the value of k
    int n;
    int k;
    //total is the amount which all the n values will be added to
    int total = 0;
    System.out.println("enter a number");
    n = input.nextInt();
    System.out.println("enter the amount of time you want a number shifted if zero input \"0\"");
    //k will represent the amount of times the loop will multiply by ten as multiplying any number by ten will shift the digit by one
    k = input.nextInt();
    //total becomes the inital value of n
    total = n;
    while (k != 0)
    {
      //increase n by one decimal place
      n = n*10;
      total = total+n;
      k--;
    }
    System.out.println(total);
  }
}