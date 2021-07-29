
// Ted Athitakis ICS4U1
// unit test 1
//even and odds
//import nessacry reasources
import java.util.ArrayList;
import java.util.Random;
 class Main {

                            public static void main (String[]args) {

                                // declaring and initialzing random numbers 
                                Random mod  = new Random();

                                // declare array to store 25 numbers 
                                int[] numbers = new int[25];

                                // declare array to store odd , even numbers 
                                ArrayList<String> odd = new ArrayList<String>();
                                ArrayList<String> even = new ArrayList<String>();


                                // make for loop to fill array
                                for (int i = 0; i<numbers.length; i++) {
                                    numbers[i] = mod.nextInt(100);


                                    // check if they are odd or even then add them to array list
                                    if (numbers[i] %2 ==  0 ) {
                                        even.add(String.valueOf(numbers[i]));
                                    }
                                    else {
                                        odd.add(String.valueOf(numbers[i]));
                                    }
                                }

                                // outputting values after it sorts
                                System.out.println("odd num: " + even);
                                System.out.println("odd num: " + odd);

                            }
}