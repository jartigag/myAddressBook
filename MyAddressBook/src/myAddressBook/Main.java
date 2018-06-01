package myAddressBook;

public class Main {

	public static void main(String[] args) {
		DBManager db = new DBManager();
		db.connectDB();

		AddressBook ab = new AddressBook("sample_contacts.vcf");
		String[] table = {"phone", "email", "ig", "fb", "tw", "sp"};

		//DATA TO MYSQL DATABASE
		/*for (int t=0; t<ab.getData().size(); t++) {
			for (int i=0; i<ab.getData().get(t).size(); i++) {
				db.insertData(table[t], (String) ab.getData().get(t).get(i));
			}
		}*/

		MyFrame mf = new MyFrame(ab.getData());
		mf.setVisible(true);

		//TODO: convert to csv
		//TODO: more charts

		db.closeDB();
	}
}
