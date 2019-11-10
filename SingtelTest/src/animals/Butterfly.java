package animals;

public class Butterfly extends Animal{
	
	private boolean isAdult;
	
	public Butterfly(boolean isAdult)
	{
		this.isAdult = isAdult;
	}
	
	
	public void fly() {
		if(isAdult)
		{
			System.out.println("I am flying");
		}
		else
		{
			System.out.println("I am crawling");
		}
	}
	
	public void say() {
		System.out.println(".........");
	}
}
