import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("May 8th challenge");
    //create a program which compares the sum of two teams basketball scores
    Scanner input = new Scanner(System.in);
    System.out.println("input the amount of 3-point shots, 2-point field goals, and 1-point field goals for the bananas in this order and pressing ENTER between each shot type");
    int bananas = input.nextInt()*3;
    bananas += input.nextInt()*2;
    bananas += input.nextInt()*1;
    System.out.println("input the the same data for the Apples");
    int apples = input.nextInt()*3;
    apples += input.nextInt()*2;
    apples += input.nextInt()*1;
    if (apples > bananas)
    {
      System.out.println("A");
    }
    else if (apples == bananas)
    {
      System.out.println("T");
    }
    else
    {
      System.out.println("B");
    }
  }
}