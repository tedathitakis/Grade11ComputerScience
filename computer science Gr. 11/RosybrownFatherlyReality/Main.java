import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("May 22nd challenge");
    Scanner input = new Scanner(System.in);
    //declare counter variable i which will hold the position of the array from the beginning (0)
    int i;
    //create a variable which will hold a tally the amount of times the same parking spots are held both days
    int tally = 0;
    System.out.println("input the amount of parking spots in parking lot");
    int lotTotal = input.nextInt();
    //create 2 arrays which will hold the amount of positions equal to the amount of parking spots defined in lotTotal
      //(the second square brackets can define the length of the array by puting a int var or a number, just don't put the {} brackets after it)
    char [] yesterday = new char [lotTotal];
    char [] today = new char [lotTotal];
    System.out.println("input whether a parking spot is taken for yesterday\n(input 'c' for Occupied or '.' for empty)\n[sample input: .cc.c.cc]");
    //create a string var in which each character is a inputed parking spot value
    String inputY = input.next();
    System.out.println("input for Today");
    String inputT = input.next();
    //separate the 2 string into 2 arrays in which each position in the array is the character from same position from the respective string
    for (i=0;i<lotTotal;i++)
    {
      yesterday[i] = inputY.charAt(i);
      today[i] = inputT.charAt(i);
    }
    //create a loop which will compare the character at each position in the two arrays and if there is a car in the same position on both days add one to the tally variable
    for(i=0;i<lotTotal;i++)
    {
      if (yesterday[i]=='c'&&today[i]=='c')
      {
        tally++;
      }
    }
    System.out.println(tally);
  }
}