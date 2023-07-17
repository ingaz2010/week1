package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight	
		int availableSeats = 17;

		
		// 2. Create a variable to hold the cost of groceries at checkout
		double checkoutGroceriesCost = 86.56;

		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'Z';

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean hotOutside=true;

		
		// 5. Create a variable to hold a customer's first name
		String firstName = "John";

		
		// 6. Create a variable to hold a street address
		String streetAddress = "1118 E 15 street";
		

		// 7. Print all variables to the console
		System.out.println(availableSeats);
		System.out.println(checkoutGroceriesCost);
		System.out.println(middleInitial);
		System.out.println(hotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);
		
		
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availableSeats = availableSeats-2;
		System.out.println(availableSeats);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		checkoutGroceriesCost = checkoutGroceriesCost + 2.15;
		System.out.println(checkoutGroceriesCost);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'M';
		System.out.println(middleInitial);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		hotOutside = false;
		System.out.println(hotOutside);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = firstName + " " + middleInitial + " Doe";
		System.out.println(fullName);
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hello! My name is " + fullName + ". I live at "+ streetAddress);
		

		
		
	}
}
