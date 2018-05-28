package myAddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddressBook {

	private ArrayList<ArrayList> datos = new ArrayList<ArrayList>();
	
	public AddressBook(String fileDir) {
		for (int i=0; i<6; i++) {
			datos.add(new ArrayList<String>());
		}
		File f = new File(fileDir);
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String l = sc.nextLine();
				String t = l.substring(l.indexOf(":")+1,l.length());
				if (l.contains("TEL")) {			datos.get(0).add(t);	}
				if (l.contains("EMAIL")) {			datos.get(1).add(t);	}
				if (l.contains("instagram.com")) {	datos.get(2).add(t);	}
				if (l.contains("facebook.com")) {	datos.get(3).add(t);	}
				if (l.contains("twitter.com")) {	datos.get(4).add(t);	}
				if (l.contains("spotify.com")) {	datos.get(5).add(t);	}
			}
			System.out.println(datos.get(0).size()+" números de teléfono guardados.\n");
			System.out.println(datos.get(1).size()+" cuentas de email guardadas.\n");
			System.out.println(datos.get(2).size()+" cuentas de instagram guardadas.\n");
			System.out.println(datos.get(3).size()+" cuentas de facebook guardadas.\n");
			System.out.println(datos.get(4).size()+" cuentas de twitter guardadas.\n");
			System.out.println(datos.get(5).size()+" cuentas de spotify guardadas.\n");
			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ArrayList> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<ArrayList> datos) {
		this.datos = datos;
	}

}
