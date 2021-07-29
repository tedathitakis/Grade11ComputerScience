class Main {
  public static void main(String[] args) {
    System.out.println("array homework day 3");
    int counter = 0;
    int[] numbers = new int[] { 5, 3, 1, 0, 9, 8, 5, 4, 3, 5, 6, 7, 7, 8 };
    for (int i = 0; i <= 13; i++) 
    {
      if (numbers[i] == 8) 
      {
        counter++;
      }
    }
    System.out.println(counter);
    String[] colours = new String[] { "red", "blue", "green", "blue", "yellow", "orange", "blue", "pink" };
    counter = 0;
    for (int i = 0; i <= 7; i++) 
    {
      if (colours[i] == "blue") 
      {
        counter++;
      }
    }
    System.out.println(counter);
  }
}