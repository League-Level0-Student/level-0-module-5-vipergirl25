import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		int a = 0;
		int b = 1;
		int c = a+b;
		System.out.println(c);
		for (int i = 0; i < 12; i++) {
			a = b;
			b = c;
			
			c = a + b;
			System.out.println(c);
		}
	}

}
