package Calculator_Package;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		//cal.addInt(25, 15);
		
		System.out.println(cal.addInt(25, 15));

	}
	
	public int addInt(int a, int b)
	{
		return a+b;
	}

}
