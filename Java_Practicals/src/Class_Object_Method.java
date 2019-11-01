
public class Class_Object_Method {

	public static void main(String[] args) {
		
		//ClassName   Object_Name = New ClassName(); 
		
		Class_Object_Method obj = new Class_Object_Method();
		
		obj.myMethod();
		obj.mySum();
	}
	
	public static void myMethod()
	{
		System.out.println("My Method Printing");
	}
	
	public void mySum()
	{
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 * num2;
		
		System.out.println("Multiple of " +num1+ " and "+num2+ " is : " + result);
	}
	

}
