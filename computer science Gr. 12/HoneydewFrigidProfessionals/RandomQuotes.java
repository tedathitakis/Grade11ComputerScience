
// Ted Athitakis ICS4U1
// RandomQuotes
// due 20/02/06
//import necessary reasources
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.lang.Math;
import java.io.FileReader;
class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("random quotes");
    //create a file object which will hold the the file of quotes
    File quotes = new File("quotes.txt");
    BufferedReader br = new BufferedReader(new FileReader(quotes));
    //create array to hold each line for the file
    String[] lines = new String[10];
    //create for loop to fill the array with the lines
    for (int i = 0; i<= 9; i++){
      lines[i] = br.readLine();
    }
    //print random line
    System.out.println(lines[(int)(Math.random()*10)]);
    //close print stream
    br.close();
  }
}