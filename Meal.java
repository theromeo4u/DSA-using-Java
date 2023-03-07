
public class Meal {
	
	public static class Food{
		String name;
		int quan;
		Food(String name,int quan){
			this.name = name;
			this.quan = quan;
		}
	}

	public static void main(String[] args) {
		Food[] foodie = new Food[5];
		
		Food food1 = new Food("Wadapav",5);
		Food food2 = new Food("Misal",2);
		Food food3 = new Food("Dosa",4);
														//Method 1 to declare Array of Objects
		foodie[0] = food1;
		foodie[1] = food2;
		foodie[2] = food3;
		
		System.out.println(foodie[0].name +" "+ foodie[0].quan);
		
		
		Food food4 = new Food("Idli",10);
		Food food5 = new Food("Upma",2);
		Food food6 = new Food("Sada Dosa",4);
														//Method 2 to declare Array of Objects
		Food[] foodie1 = {food4,food5,food6};
		
		System.out.println(foodie1[1].name + " " + foodie1[1].quan);
		
	}

}
