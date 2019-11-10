package animals;

public class RoosterNonInheritance {

	//No Inheritance. Using Composition
	private boolean isfemale = false;
	private Chicken chicken = new Chicken();
	private ChickenActions ca = new ChickenActions();
		
	public void say() {
		ca.say(isfemale);
	}
	
	public void peck()
	{
		chicken.peck();
	}
		
}