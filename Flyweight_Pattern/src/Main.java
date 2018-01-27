
public class Main {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight flyweight = factory.getFlywight("A");
		
		System.out.println(flyweight);
		
		flyweight = factory.getFlywight("A");
		System.out.println(flyweight);
		
		flyweight = factory.getFlywight("A");
		System.out.println(flyweight);
	}
}
