import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("For loops");
    Scanner input = new Scanner(System.in);
    int i = 1;
    //print numbers 1-100
    for (i=1; i <= 100; i++)
    {
      System.out.println(i);
    }
    //print gonzaga ten times
    for (i=1;i<=10;i++)
    {
      System.out.println("Gonzaga");
    }
    for (i=1;i<=10;i++)
    {
      System.out.println(i+". Gonzaga");
    }
    //print the 1 times table
    for (i=1;i<=12;i++)
    {
      System.out.println("1 x "+i+" = "+i);
    }
    //print the sevens times table 
    for (i=1;i<=12;i++)
    {
      System.out.println("7 x "+i+" = "+i*7);
    }
    //print a times table of the users choice
    System.out.println("enter in a number");
    int num = input.nextInt();
    for (i=1;i<=12;i++)
    {
      System.out.println(num+" x "+i+" = "+i*num);
    }
  }
}
