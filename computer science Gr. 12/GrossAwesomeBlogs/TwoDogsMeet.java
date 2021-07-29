
// Ted Athitakis ICS4U1
// two dogs meet
// due 20/01/27
//import nessacry reasources
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Character;

//class for declaring
class Dog {
  // declare Scanner to be able to collect inputs
  Scanner input = new Scanner(System.in);
  // declare variables of their characteristics
  private int hunger, aggression, age;
  private String dogName, dogBreed;

  // constructors
  Dog(String dgName, String dgBreed) {
    // randomly assign aggression, hunger and age
    this.aggression = (int) (Math.random() * 10);
    this.hunger = (int) (Math.random() * 10);
    this.age = (int) (Math.random() * 100);
    this.dogName = dgName;
    this.dogBreed = dgBreed;
  }

  // getters
  public int getAge() {
    return this.age;
  }

  public int getAggression() {
    return this.aggression;
  }

  public int getHunger() {
    return this.hunger;
  }

  public String getName() {
    return this.dogName;
  }

  public String getBreed() {
    return this.dogBreed;
  }

  // setters
  public void setAge(int dgAge) {
    this.age = dgAge;
  }

  public void setAggression(int dgAggression) {
    this.aggression = dgAggression;
  }

  public void setHunger(int dgHunger) {
    this.hunger = dgHunger;
  }

  // method to confirm the setting of the variables for the dogs
  public boolean confirmer(Dog z) {
    //prompt user to change variables or continue
    System.out.print(
        "would you like to change the aggression or hunger of these dogs? Enter in ''1' for aggression and '2' for hunger if desired or anything else to confirm: ");
    //collect input and continue
    switch (input.next().charAt(0)) {
    case '1': {
      System.out.print("enter in aggression value: ");
      this.aggression = input.nextInt();
      break;
    }
    case '2': {
      System.out.print("enter in hunger value: ");
      this.hunger = input.nextInt();
      break;
    }
    default: {
      return true;
    }
    }
    return false;
  }

  // method to simulate meeting
  public void meeting(Dog a, Dog b) {
    //check if the aggression value is greater than 5 for ethier dog after being subtracted from half of their hunger value and inform the user of the result of the meeting
    if (((a.aggression - (a.hunger/ 2)) > 5) || ((b.aggression - (b.hunger / 2)) > 5)) {
      System.out.println("The meeting is aggressive.");
    }else{
      System.out.println("The meeting was calm");
    }
  }
}

class Main {
  public static void main(String[] args) {
    // declare variables
    String inputStringa = "e";
    String inputStringb = "e";
    boolean confirm = false;

    int inputInteger = 0;
    // delare scanner to collect inputs
    Scanner input = new Scanner(System.in);

    // create the 2 dogs by prompting the user to enter in the atributes then contruct the dogs
    System.out.println("2 dogs meet\n2 dogs will be created");
    System.out.print("enter in the first's dogs name: ");
    inputStringa = input.next();
    System.out.print("enter in the first's dogs breed: ");
    inputStringb = input.next();
    Dog a = new Dog(inputStringa, inputStringb);
    System.out.print("enter in the second's dogs name: ");
    inputStringa = input.next();
    System.out.print("enter in the second's dogs breed: ");
    inputStringb = input.next();
    // print out the information for each dog
    Dog b = new Dog(inputStringa, inputStringb);

    // dog 1
    System.out.println("Dog 1: " + a.getName() + "\tbreed: " + a.getBreed() + "\thunger: " + a.getHunger() + "\t age: "
        + a.getAge() + "\taggression: " + a.getAggression());
    // confirm aggression and hunger with user
    while (confirm == false) {
      confirm = a.confirmer(a);
    }

    // dog 2
    System.out.println("Dog 2: " + b.getName() + "\tbreed: " + b.getBreed() + "\thunger: " + b.getHunger() + "\t age: "
        + b.getAge() + "\taggression: " + b.getAggression());
    // confirm aggression and hunger with user
    confirm = false;
    while (confirm == false) {
      confirm = b.confirmer(b);
    }
    // simulate meeting
    a.meeting(a,b);
  }
}