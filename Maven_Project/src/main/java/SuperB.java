
public class SuperB extends SuperA  {
	
	public void sum()
	{
		super.addNum();
		System.out.println("hello");
		System.out.println(super.x);

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperB b = new SuperB();
		b.sum();
		
	}

}
