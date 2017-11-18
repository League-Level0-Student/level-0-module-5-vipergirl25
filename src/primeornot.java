import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	String primeornotnumber = JOptionPane.showInputDialog("Enter a number to see if it is prime or not?");
	int number = Integer.parseInt(primeornotnumber);
	boolean prime = true;
	for (int i = 2; i < Math.sqrt(number); i++) {
		int thingy = number%i;
		if(thingy==0) {
			prime = false;
			break;
		}
			
		}
	if (prime) {
		System.out.println("Number is prime.");
	}
	else {
		System.out.println("number is not prime.");
	}
	}
}


