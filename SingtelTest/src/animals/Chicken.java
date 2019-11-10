package animals;

public class Chicken extends Bird{
	
	private boolean isfemale = true;
	private ChickenActions ca = new ChickenActions();
	
	public Chicken()
	{
	}
	
	public void say() {
		ca.say(isfemale);
	}
	
	public void fly() {
		System.out.println("I am not able to fly");
	}
	
	public void peck() {
		System.out.println("Pecking ground for food");
	}
}