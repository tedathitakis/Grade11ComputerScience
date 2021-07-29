
// Ted Athitakis ICS4U1
// phonebook
// due 20/02/07
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
    // create boolean format to keep track if format is correct for each input
    boolean format = true;
    do {
      // print prompt to input
      System.out.print(b);
      // collect input
      String c = input.nextLine();
      // check with input has been put in
      switch (a) {
      // string to string
      case 0: {
        return c;
      }
      // string to number for phones
      case 1: {
        // check if the input is able to be parsed as a number and if not have them try again
      char[] Phone = c.toCharArray();
        for (int i = 0; i < c.length(); i++){
          if (Character.isDigit(Phone[i])){
          }else{
            format = false;
            System.out.println("invalid phonenumber try again");
            break;
          }
          if (i == (c.length()-1)) {
            return c;
          }
        }
        break;
      }
      // postal code
      case 2: {

        char[] Postal = c.toCharArray();
        // check if there are 6 characters and if each odd character is a letter while
        // each even character is a number
        if (c.length() == 6) {
          for (int i = 0; i < 6; i++) {
            if (((i % 2) == 1) && (Character.isDigit(Postal[i]))) {

            } else if (((i % 2) == 0) && (Character.isLetter(Postal[i]))) {
            } else {
              format = false;
              System.out.println("invalid postal code, try again.");
              break;
            }
            if (i == 5) {
              return c;
            }
          }
        } else {
          format = false;
          System.out.println("invalid postal code, try again.");
          break;
        }
      }
      }
    } while (format == false);
    return "method complete";
  }

  // add to file method
  public static void addContact(String a, String b, String c, String d) throws IOException {
    // create a PrintWriter obj which will write to the FileWriter object through
    // the file path
    File file = new File("phonebook.txt");
    FileWriter fw = new FileWriter(file, true);
    PrintWriter pw = new PrintWriter(fw);
    pw.print(a);
    pw.print(" " + c);
    pw.print(" " + d);
    pw.print(" " + b+"\n");
    pw.close();
  }

  public static void main(String[] args) throws IOException {
    // define variables for each part of the contact
    String name, address, pN, postalCode;
    // define variable to know if the user wants to add another contact
    String add;
    System.out.println("phonebook");
    // Output all previous information here with s bufferedReader
    File file = new File("phonebook.txt");
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    // while bufferedReader is ready print all previous contacts
    while (br.ready()) {
      System.out.println(br.readLine());
    }
    br.close();
    do {
      // ask the user if they would like to add a contact
      add = (inputer(0, "type 'yes' if you would like to add 5 contacts. \nInput: "));
      if (true != add.equals("yes")) {
        break;
      }
      //have them enter in 5 contacts
      for (int e = 0; e <5; e++)
      {
      // collect the info for each contact using the inputer method
      name = inputer(0, "Input name of contact: ");
      address = inputer(0, "Input address of contact: ");
      pN = inputer(1, "Input phonenumber for contact: ");
      postalCode = inputer(2, "Input the postal code of the contact in the form L#L#L#: ");
      // add to contact
      addContact(name, address, pN, postalCode);
      }
    } while (add.equals("yes"));
    //output the entire phonebook
    FileReader gr = new FileReader(file);
    BufferedReader er = new BufferedReader(gr);
    // while bufferedReader is ready print all previous contacts
    while (er.ready()) {
      System.out.println(er.readLine());
    }
    er.close();

  }
}