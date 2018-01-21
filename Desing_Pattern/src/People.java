
public class People {
	private Food food;
	
	//교환
	public void setFood(Food food) {
		this.food = food;
	}
	
	public void eat(){
		if (food == null){
			System.out.println("공복");
		}else {
			//델리게이트
			food.eat();
		}
	}
}
