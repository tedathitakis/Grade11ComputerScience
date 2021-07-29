class Main
{
  public static void main(String[] args) 
  {
    System.out.println("Loop if else questions");
    //while loop
    // print numbers 1-100 and determine if they are even or odd
    int i = 1;
    while (i <= 100)
    {
      if (i % 2 == 0)
      {
        System.out.println(i+" is even");
      }
      else
      {
        System.out.println(i+" is odd");
      }
      i++;
    }
    //print numbers 1-100 and determine if they are multiples of 4
    i=1;
    while (i<=100)
    {
      if (i % 4 == 0)
      {
        System.out.println(i+" is a multiple of four");
      }
      else
      {
        System.out.println(i+" is not a multiple of four");
      }
      i++;
    }
    //print numbers 1-100 and determine if they are a multiple of three (and print "Fizz") and if it is a multiple of 5 (and print "Buzz") if netheir print the number
    i=1;
    while (i<=100)
    {
      if (i % 5 == 0 && i % 3 == 0)
      {
        System.out.println("FizzBuzz");
      } 
      else if (i % 5 == 0)
      {
        System.out.println("Buzz");
      }
      else if (i%3==0)
      {
        System.out.println("Fizz");
      }
      else
      {
        System.out.println(i);
      }
      i++;
    }
    //for loop
    //print numbers 1-100 and determine if they are even or odd
    for (i = 1; i <= 100; i++)
    {
      if (i % 2 == 0)
      {
        System.out.println(i+" is even");
      }
      else
      {
        System.out.println(i+" is odd");
      }
    }
    //print numbers 1-100 and check if they are multiples of four
    for (i = 1; i <=100; i++)
    {
      if (i%4==0)
      {
        System.out.println(i+" is a multiple of four");
      }
      else
      {
        System.out.println(i+" is not a multiple of four");
      }
    }
    //print numbers 1-100 and check if they are a multiple of three (and print Fizz) and check if they are a multiple of five (and print Buzz)
    for (i = 1; i<=100; i++)
    {
      if (i%5==0&&i%3==0)
      {
        System.out.println("FizzBuzz");
      }
      else if (i%5==0)
      {
        System.out.println("Buzz");
      }
      else if (i%3==0)
      {
        System.out.println("Fizz");
      }
      else
      {
        System.out.println(i);
      }
    }
  }
}