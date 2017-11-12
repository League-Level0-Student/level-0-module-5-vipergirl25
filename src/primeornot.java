import javax.swing.JOptionPane;

public class primeornot {
	public static void main(String[] args) {
		int usernumber = JOptionPane.showMessageDialog(null, "Enter a number:");
		for (int i = 0; i < usernumber; i++) {
				int divisiblenumber = usernumber-i;
				if(usernumber%divisiblenumber==0) {
					System.out.println("not prime");	
					}
		
	}

}
