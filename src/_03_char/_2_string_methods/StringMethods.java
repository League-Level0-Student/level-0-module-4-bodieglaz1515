package _03_char._2_string_methods;

public class StringMethods {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to contain a minimum of 3
		// characters
		StringBuilder meow = new StringBuilder();


	                      
		for(int i = 0 ; i < 536870911; i++) {
			try {
				meow.append("meow");
			}catch(java.lang.OutOfMemoryError e) {
				e.printStackTrace();
				System.out.println("i is " + i);
				break;
			}

		}
	//	75497471
		
		//		2147483647
		// 2. Print the 3rd char of your String to the console.
		// HINT: .charAt

		System.out.println(meow.charAt(2));
		// 3. Print the length of your String to the console.
		// HINT: .length()
		System.out.println(meow.length());
		// 4. Using a for loop, print one char at time to the console.
		// HINT: use .length() to determine how many loops
		for (int mewo = 0; mewo < meow.length(); mewo++) {

			System.out.println(meow.charAt(mewo) + " is the " + (mewo + 1) + mEOW(mewo + 1) + " letter you typed "
					+ ((mewo+1) / 4 ) + " meows");

		}

		// 5. Pick a char inside your String, and use a loop to determine
		// what position/index in the String the char is located.
		// Print the char's position to the console.
		// EXAMPLE: if your string is "abc" and you are searching
		// for char 'b', then print "b is at index 1"

	}

	static String mEOW(int mewo) {
		if (mewo % 10 == 1) {

			return "st";
		} else if (mewo % 10 == 2) {
			return "nd";
		} else if (mewo % 10 == 3) {
			return "rd";
		} else {

			return "th";

		}
	}
}
