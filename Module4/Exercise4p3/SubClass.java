public class SubClass extends ParentClass {

// Exercise 4.3 Tests to see if assertions are true:
// overriding parent's protected method by setting equal to 2 instead of 1 
	protected static int x4 = 2;
// overriding parent's public method and making it protected 
	protected static int x3 = 4;
// overriding parent's public method and making it private 
	private static int x5 = 3;
	public static void main(String[]args) {
		System.out.println("Sub Class: ");
		System.out.println("protected static int x4: " + x4);
		System.out.println("protected static int x3: " + x3);
		System.out.println("private static int x5: " + x5);
	}

}

