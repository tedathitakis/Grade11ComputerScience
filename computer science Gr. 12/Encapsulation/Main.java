import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// create an arraylist to hold all the cellphones
		ArrayList<CellPhone> list = new ArrayList<>();
		// create scanner object to collect inputs
		Scanner input = new Scanner(System.in);

		// create a flag to have user create cellphones until they want to stop
		boolean stop = false;

		// create int var to hold amount of cellphone objects
		int nPhones = 0;

		while (stop == false) {
			System.out.print(
					"Enter in number coralating to the option \n 1. create a cell phone \n 2. display all cellphone info \n 3. exit program \n input: ");
			switch (input.nextInt()) {
			case 1: {
				System.out.print(
						"Set the carrier, type of phone, speed of phone, amount of memory in gigabytes and the number of app while pressing space in between each input: ");

				list.add(0, new CellPhone(input.next(), input.next(), input.nextDouble(), input.nextDouble(),
						input.nextInt()));
				nPhones++;
				break;
			}
			case 2: {
				for (int i = 0; i < nPhones; i++) {
					System.out.println("cellphone " + i + ": " + list.get(i).toString());

				}
			}
			case 3: {
				System.exit(0);
			}
			}
		}
	}

}
