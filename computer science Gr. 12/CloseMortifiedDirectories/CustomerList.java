
// Ted Athitakis ICS4U1
// Customer List
// due 20/02/06
//import necessary reasources
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.lang.Math;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.lang.Character;
import java.io.PrintWriter;

class Main {
  // create instance of scanner object to collect inputs
  static Scanner input = new Scanner(System.in);

  // inputer method
  public static String inputer(int a, String b) {
    //create boolean format to keep track if format is correct for each input
    boolean format = true;
    do {
      //print prompt to input
      System.out.print(b);
      //collect input
      String c = input.nextLine();
      //check with input has been put in
      switch (a) {
      //string to string
      case 0: {
        return c;
      }
      //string to number specfically the amount of profiles
      case 1: {
        //check if the input is able to be parsed as a number and if not restar program
        try {
          Integer.parseInt(c);
          return c;
        } catch (NumberFormatException e) {
          System.out.println("Invalid input, restart program");
          System.exit(0);
        }
        break;
      }
      //postal code
      case 2: {

        char[] Postal = c.toCharArray();
        //check if there are 6 characters and if each odd character is a letter while each even character is a number
        if (c.length() == 6) {
          for (int i = 0; i < 6; i++) {
            if (((i % 2) == 1) && (Character.isDigit(Postal[i]))) {

            } else if (((i % 2) == 0) && (Character.isLetter(Postal[i]))) {
            } else {
              format = false;
              System.out.println("invalid postal code, try again.");
              break;
            }
            if (i==5){
              return c;
            }
          }
        }else{
          format = false;
          System.out.println("invalid postal code, try again.");
          break;
        }
      }
      }
    } while (format == false);
    return "method complete";
  }
  //add to file method
  public static void addProfile(String a, String b, String c, String d, String e) throws IOException {
    //create a PrintWriter obj which will write to the FileWriter object through the file path
    File file = new File("customerInfo.txt");
    FileWriter fw = new FileWriter(file, true);
    PrintWriter pw = new PrintWriter(fw);
    pw.println("\nProfile: ");
    pw.println("name: "+a);
    pw.println("address: "+b);
    pw.println("city: "+c);
    pw.println("province: "+d);
    pw.println("postal code: "+e);
    pw.close();
  }

  public static void main(String[] args) throws IOException {
    // define variables for each part of the profile
    String name, address, city, province, postalCode;
    System.out.println("Customer list");
    //Output all previous information here with s bufferedReader
    File file = new File("customerInfo.txt");
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    //while bufferedReader is ready print all previous profiles
    while (br.ready()){
      System.out.println(br.readLine());
    }
    br.close();
    // ask the user of how many profiles they would like to create and save it
    int inCustomers = Integer.valueOf(inputer(1, "How many customers would you like to add? \nInput: "));
    //collect the info for each profile using the inputer method
    for (int i = 0; i < inCustomers; i++) {
      name = inputer(0, "Input name of customer: ");
      address = inputer(0, "Input address of customer: ");
      city = inputer(0, "Input city of residence for customer: ");
      province = inputer(0, "Input province of residence for customer: ");
      postalCode = inputer(2, "Input the postal code of the customer in the form L#L#L#: ");
      //add to profile
      addProfile(name, address, city, province, postalCode);
    }

  }
}