package myAddressBook;

import java.util.ArrayList;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(ArrayList<Integer> values) {
		setSize(600,600);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null); // así aparece centrado
		getContentPane().add(new MyPanel(values));
	}

}
