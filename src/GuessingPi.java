/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		
	

		// 2. Make a String variable to hold the value of Pi.
		String pi = "3.1415926535897932384626433832";
		//    Get the first few digits from http://www.piday.org/million/.
		

		// 3. Print out the first 3 digits of Pi to the console.
		JOptionPane.showMessageDialog(null, pi.charAt(0));
		JOptionPane.showMessageDialog(null, pi.charAt(1));
		JOptionPane.showMessageDialog(null, pi.charAt(2));
		JOptionPane.showMessageDialog(null, pi.charAt(3));
		
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.

		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.
		String Times = JOptionPane.showInputDialog("How many times do you want to guess?");
		int times = Integer.parseInt(Times);
				for (int h = 0; h < times; h++) {
					
				

			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
		int pilength = pi.length();
		for (int i = 4; i < pilength; i++) {
			
		

				// 5. Ask the user for the NEXT digit of pi.
			String nextdigit = JOptionPane.showInputDialog("What is the next digit of pi?");

				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 
			if(nextdigit.charAt(0) == pi.charAt(i)) {
				JOptionPane.showMessageDialog(null, "Correct");
					// 7. If they are correct, print out "correct".
			}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect. You need to start over.");
				break;

					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
			}
		}
	}
	}

}


