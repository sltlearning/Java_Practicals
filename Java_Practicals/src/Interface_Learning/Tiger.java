package Interface_Learning;

public class Tiger implements Animal {
	
	public void eat()
	{
		System.out.println("Tiger can eat fast");
	}
	
	public void run()
	{
		System.out.println("Tiger run slowly");
	}
		

	public static void main(String[] args) {
		
		Tiger t_object = new Tiger();
		
		t_object.eat();
		t_object.run();
		

	}

}
