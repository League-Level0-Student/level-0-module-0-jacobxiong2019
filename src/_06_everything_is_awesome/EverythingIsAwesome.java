package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, s + " is awesome!");
	}
}
