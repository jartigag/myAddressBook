package myAddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddressBook {

	private ArrayList<Integer> i = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0));
	// hay una manera mejor de inicializar?
	
	public AddressBook(String fileDir) {
		File f = new File(fileDir);
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String l = sc.nextLine();
				if (l.contains("TEL")) {			i.set(0,i.get(0)+1);}
				if (l.contains("EMAIL")) {			i.set(1,i.get(1)+1);}
				if (l.contains("instagram.com")) {	i.set(2,i.get(2)+1);}
				if (l.contains("facebook.com")) {	i.set(3,i.get(3)+1);}
				if (l.contains("twitter.com")) {	i.set(4,i.get(4)+1);}
				if (l.contains("spotify.com")) {	i.set(5,i.get(5)+1);}
			}
			System.out.println(i.get(0)+" números de teléfono guardados.\n");
			System.out.println(i.get(1)+" cuentas de email guardadas.\n");
			System.out.println(i.get(2)+" cuentas de instagram guardadas.\n");
			System.out.println(i.get(3)+" cuentas de facebook guardadas.\n");
			System.out.println(i.get(4)+" cuentas de twitter guardadas.\n");
			System.out.println(i.get(5)+" cuentas de spotify guardadas.\n");
			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Integer> getI() {
		return i;
	}

	public void setI(ArrayList<Integer> i) {
		this.i = i;
	}

}
