package Day4;

public class T20match extends Match {

	public T20match() {
		super();
		
	}

	@Override
	float calculateRunRate() {
	
			return ((getTarget()-getCurrentScore())/(20-getCurrentOver()));
			}
	@Override
	
	float calculateBalls() {
		return 6*(20-getCurrentOver());
	}
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}
}