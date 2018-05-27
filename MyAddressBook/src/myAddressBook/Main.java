package myAddressBook;

import myAddressBook.AddressBook;
import myAddressBook.MyFrame;

public class Main {

	public static void main(String[] args) {
		
		AddressBook ab = new AddressBook("contacts.vcf");
		MyFrame mf = new MyFrame(ab.getI());
		mf.setVisible(true);
	}
}
