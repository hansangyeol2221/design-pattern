//
public class Main {
	public static void main(String[] args) {
		People people = new People();
		
		people.eat();
		
		people.setFood(new Chicken());
		people.eat();
		
		people.setFood(new Pasta());
		people.eat();
	}
}
