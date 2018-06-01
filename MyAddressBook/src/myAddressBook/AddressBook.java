package myAddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	private ArrayList<ArrayList> data = new ArrayList<ArrayList>();
	
	public AddressBook(String fileDir) {
		for (int i=0; i<6; i++) {
			data.add(new ArrayList<String>());
		}
		File f = new File(fileDir);
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String l = sc.nextLine();
				String t = l.substring(l.indexOf(":")+1,l.length());
				if (l.contains("TEL")) {			data.get(0).add(t);	}
				if (l.contains("EMAIL")) {			data.get(1).add(t);	}
				if (l.contains("instagram.com")) {	data.get(2).add(t);	}
				if (l.contains("facebook.com")) {	data.get(3).add(t);	}
				if (l.contains("twitter.com")) {	data.get(4).add(t);	}
				if (l.contains("spotify.com")) {	data.get(5).add(t);	}
			}
			System.out.println(data.get(0).size()+" phone numbers.\n");
			System.out.println(data.get(1).size()+" email accounts.\n");
			System.out.println(data.get(2).size()+" instagram accounts.\n");
			System.out.println(data.get(3).size()+" facebook accounts.\n");
			System.out.println(data.get(4).size()+" twitter accounts.\n");
			System.out.println(data.get(5).size()+" spotify accounts.\n");
			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ArrayList> getData() {
		return data;
	}

	public void setData(ArrayList<ArrayList> data) {
		this.data = data;
	}

}
