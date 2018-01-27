
public class Table {
	public static void main(String[] args) {
		Number table1 = Number.getInstance();
		Number table2 = Number.getInstance();
		
		System.out.println(table1.getNumber());
		System.out.println(table2.getNumber());
		
		table1.setNumber(2);
		System.out.println(table1.getNumber());
		System.out.println(table2.getNumber());
		
		table2.setNumber(3);
		System.out.println(table1.getNumber());
		System.out.println(table2.getNumber());
	}
}
