
public class People {
	private Food food;
	
	//��ȯ
	public void setFood(Food food) {
		this.food = food;
	}
	
	public void eat(){
		if (food == null){
			System.out.println("����");
		}else {
			//��������Ʈ
			food.eat();
		}
	}
}
