package animals;

public class Fish extends Animal {
	
	FishActions fa = new FishActions();
	Boolean ableToWalk = false;
	
	@Override
	public void walk() {
		System.out.println("I am not able to walk");
	}
	
	public void swim()  {
		fa.swim();
	}
}
