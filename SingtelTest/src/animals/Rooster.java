package animals;

public class Rooster extends Chicken {
	
	private boolean isfemale = false;
	private ChickenActions ca = new ChickenActions();
	
	public Rooster()
	{
		super();
	}
	
	public void say() {
		ca.say(isfemale);
	}
}