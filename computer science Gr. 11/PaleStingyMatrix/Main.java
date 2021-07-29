import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("using loops and arrays");
    Scanner input = new Scanner(System.in);
    int i = 1;
    int numb;
    for (i=i;i<=10;i++)
    {
      System.out.println("input a number");
      numb = input.nextInt();
      //the remainder of a number divided by 2 will be 0 if even or 1 if odd
      if ((numb%2)==0)
      {
        System.out.println("inputed number is even");
      }
      else
      {
        System.out.println("inputed number is odd");
      }
    }
    int [] numberArray = new int [] {84,67,79,70,77,63,58,90,91,64};
    //arrays start counting at 0
    for (i=0;i<=9;i++)
    {
      //square brackets after and array returns the var at the postion of the number in the array
      if ((numberArray[i]%2)==0)
      {
        System.out.println(numberArray[i]+" is even");
      }
      else
      {
        System.out.println(numberArray[i]+" is odd");
      }
    }
  }
}