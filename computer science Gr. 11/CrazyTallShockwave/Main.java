import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    //print hello world 5 times
    int i = 1;
    while (i <= 5) 
    {
      System.out.println("Hello world!");
      i++;
    }
    i = 1;
    //print hello world 10 times
    while (i <= 10)
    {
      System.out.println("Hello world!");
      i++;
    }
    //print hello world 100 times
    i = 1;
    while (i <= 100)
    {
      System.out.println("Hello world!");
      i++;
    }
    //prompt user to first enter their name then a number
    i = 1;
    System.out.println("enter your name");
    String name = input.nextLine();
    System.out.println("enter a number");
    int j = input.nextInt();
    //print name the amount of the number
    if (j >= 0 )
    {
      while (i <= j)
      {
        System.out.println(name);
        i++;
      }
    }
    else
    {
      System.out.println("invalid input");
    }
    //print the first ten numbers in accending and decending order
    i = 1;
    while (i <= 10)
    {
      if (i == 10)
      {
        System.out.println(i);
      }
      else
      {
        System.out.print(i+", ");
      }
      i++;
    }
    i= 10;
    while (i >= 1)
    {
      if (i == 1)
      {
        System.out.println(i);
      }
      else
      {
        System.out.print(i+", ");
      }
      i--;
    }
    //print out the first ten squared numbers
    i = 1;
    while (i <= 10)
    {
      if (i == 10)
      {
        System.out.println(i*i);
      }
      else
      {
        System.out.print(i*i+", ");
      }
      i++;
    }
    //print the first ten even numbers
    i= 2;
    while (i <= 20)
    {
      if (i == 20)
      {
        System.out.println(i);
      }
      else
      {
        System.out.print(i+", ");
      }
      i += 2;
    }
    i= 1;
    while (i <= 10)
    {
      if (i == 10)
      {
        System.out.println(i*2);
      }
      else
      {
        System.out.print(i*2+", ");
      }
      i++;
    }
    //print the first ten odd numbers
    i=1;
    while (i <= 19)
    {
      if (i == 19)
      {
        System.out.println(i);
      }
      else
      {
       System.out.print(i+", ");
      }
      i += 2; 
    }
    //Set integer i to 1
    i = 1;
    
    //Condtition: i is less than or equal to 10
    while(i <=10)
    {
      //Prints out Hello World and the current value of i
      System.out.println("Hello World "+i);
      i++;
    }
  }
}