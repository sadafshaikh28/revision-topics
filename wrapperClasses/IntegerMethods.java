package wrapperClasses;

public class IntegerMethods {

	public static void main(String[] args) {
		
		Integer a = 45678;
		Integer b = 123;
		
		String str = Integer.toString(a);
		
		System.out.println("Value : " + str);
		System.out.println("Type : " + str.getClass().getSimpleName());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int x=10;
		int y = 15;
		
		int answer = Integer.compare(x, y);
		System.out.println(answer);
		
		int res = Integer.sum(a , b);
	    System.out.println("The sum of a and b is: " + res);
		
		boolean res1 = a.equals(b);
		System.out.println(res1);
	}

}

 /*	Java.lang.Integer class in Java :
 *  Integer class is a wrapper class for the primitive type int which contains several methods to effectively deal with an int value 
 *  like converting it to a string representation, and vice-versa.
 *  An object of the Integer class can hold a single int value.
 *  
 *  The Java Integer class has methods to convert an int to a String and vice-versa,
 *  as well as various constants(MAX_VALUE,MIN_VALUE, SIZE,TYPE) and methods that deal with ints.
 */