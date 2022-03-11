package Day4;

public class Testmatch extends Match{

	public Testmatch() {
		super();
	}

	@Override
	float calculateRunRate() {
		return ((getTarget()-getCurrentScore())/(90-getCurrentOver()));
	}
	@Override
	float calculateBalls() {
		return 6*(90-getCurrentOver());
	}
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}
}