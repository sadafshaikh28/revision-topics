package wrapperClasses;

public class Demo {

	public static void main(String[] args) {
		
		//primitive types
		int a=1;		
		int b=2;
		
		//boxing																					(primitive to object type / reference variables)
		Integer num1 = Integer.valueOf(65);		
		Integer num2 = Integer.valueOf(a);	
		
		//auto-boxing
		Integer num3 = 15;						
		Integer num4 = b;						
		
		System.out.println(num1);
		System.out.println(num3);

																									//System.out.println(num4 + " " + num4.getClass().getSimpleName());
		//unboxing
		int n1 = num1.intValue();				
		System.out.println(n1);				
		
		//auto-unboxing
		int n2 = num2;							
		System.out.println(n2);
		
		//other data type's wrapper classes
		Byte x = 123;
		Short y = 45;
		Long l = 34l;
		Float f= 3.14f;
		Double d = 255.678;
		Character ch ='s';
		Boolean bool = true;
			
	}

}
