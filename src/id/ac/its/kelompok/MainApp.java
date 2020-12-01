package id.ac.its.kelompok;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
		
		JOptionPane.showMessageDialog(null, "The sum is " + firstNumber,
				"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
		
			
		
	}

}
