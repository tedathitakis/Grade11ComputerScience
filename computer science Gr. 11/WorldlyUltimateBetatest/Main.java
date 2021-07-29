import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("adding with loops");
    //the counter variable for the amount of time a for loop will run
    int i = 0;
    //the sum of the enter numbers
    int sum = 0;
    //the number imputed by the user
    int num = 0;
    Scanner input = new Scanner(System.in);
    for(i=1;i<=10;i++)
    {
      System.out.println("input a number");
      num = input.nextInt();
      sum += num;
    }
    System.out.println(sum);
    System.out.println("input the amount of numbers you want to add");
    i = input.nextInt();
    sum = 0;
    while (i>0)
    {
      System.out.println("please enter a number");
      num = input.nextInt();
      if (num>=0)
      {
        sum += num;
        i--;
      }
      else
      {
        System.out.println("invalid input, try again");
      }
    }
    System.out.println(sum);
    sum = 0;
    for (i=1;i<=100;i++)
    {
      sum += i;
    }
    System.out.println(sum);
  }
}