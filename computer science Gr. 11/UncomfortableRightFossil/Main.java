class Main {
  public static void main(String[] args) {
    System.out.println("Array excecises day 1");
    int i=0;
    //create a string array which holds the city names from smallest to greatest
    String [] citys = new String[]{"Kitchener","Hamilton","Quebec City","Winipeg","Ottawa","Edmonton","Calgary","Vancouver","Montréal","Toronto"};
    //create a integer array which holds the city pop from smallest to greatest
    int [] population = new int[]{470015,693645,705103,711925,711925,989657,1062643,1237656,2264823,3519595,5429524};
    System.out.println("the top ten biggest countrys by population are");
    for (i=i;i<=9;i++)
    {
      System.out.println("number "+(10-i)+". "+citys[i]+" with a population of "+population[i]);
    }
  }
}