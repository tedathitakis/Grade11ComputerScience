// Ted Athitakis  ICS4U1  Due: 08/01/2021
//Purpose: determine which numbers out of 1000 are prime
class Main {
  public static void main(String[] args) {
    //create an array to hold all numbers up to 1000
    boolean numbers[] = new boolean[1000];
    //use a for loop to go through each number
    for (int i = 1; i <= 1000; i++)
    {
      //set each number to represent having a prime number
      numbers[i-1] = true;
      //check if each number is prime by checking if every number from 2 to itself -1 has a remainder
      for (int q = 2; q <=i ; q++ )
      {
        if (i%q == 0 && (q != i))
        { 
          //change it to not being a prime number
          numbers[i-1] = false;
        }
      }
      //check if a number is prime
      if (numbers[i-1] == true)
      {
        //print the number and its prime status
        System.out.print(i+", ");
      }
    }
  }
}