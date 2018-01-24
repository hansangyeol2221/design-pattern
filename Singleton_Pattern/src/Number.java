
public class Number {
	static private Number instance;
	private int number;
	
	private Number() {
		number = 1;
	};
	public static Number getInstance() {
		if(instance == null) {
			instance = new Number();
		}
		return instance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
