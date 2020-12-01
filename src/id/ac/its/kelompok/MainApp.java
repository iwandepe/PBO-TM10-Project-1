package id.ac.its.kelompok;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		String inpRadius = JOptionPane.showInputDialog("Enter radius : ");
		Circle acircle = new Circle(Integer.parseInt(inpRadius));
		
		JOptionPane.showMessageDialog(null, "The Area of Circle = " + acircle.getArea(),
				"The Area of Circle", JOptionPane.PLAIN_MESSAGE);
	}
}
