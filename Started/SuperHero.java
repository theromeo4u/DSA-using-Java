
public class SuperHero {
	
	public static class Person{
		String name;
		int age;
		Person(String name, int age){
			this.name = name;
			this.age = age;
			
		}
		
		public String toString() { 
			return "The name of hero is "+name + " and age of hero is " + age;
		}
		
	}
	
	public static class Hero extends Person{
		String power;
		Hero(String name, int age, String power){
			super(name,age);
			this.power = power;
		}
		public String toString() {
			return super.toString() +" having power "+ this.power;
		}
		
		
	}

	public static void main(String[] args) {
		Hero hero = new Hero("Romeo",23,"##");
		System.out.println(hero.toString());
	}

}
