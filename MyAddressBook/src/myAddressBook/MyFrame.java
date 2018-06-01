package myAddressBook;

import java.util.ArrayList;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(ArrayList<ArrayList> values) {
		super();
		setSize(600,600);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null); // centered in screen
		getContentPane().add(new MyPanel(values));
	}

}
