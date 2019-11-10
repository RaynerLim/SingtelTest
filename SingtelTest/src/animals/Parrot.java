package animals;

public class Parrot extends Bird{
	
	private String nearbySounds;

	public Parrot(String nearbySounds) {
		this.nearbySounds = nearbySounds;
	}
	
	public void say()
	{
		System.out.println(nearbySounds);
	}
}