package myAddressBook;

public class Main {

	public static void main(String[] args) {
		GestorDB db = new GestorDB();
		db.conectarDB();

		AddressBook ab = new AddressBook("contacts.vcf");
		String[] tabla = {"tfno", "email", "ig", "fb", "tw", "sp"};

		for (int t=0; t<ab.getDatos().size(); t++) {
			for (int i=0; i<ab.getDatos().get(t).size(); i++) {
				db.insertarDato(tabla[t], (String) ab.getDatos().get(t).get(i));
			}
		}
	}
}
