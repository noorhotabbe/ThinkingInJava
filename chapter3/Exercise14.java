/* Write a method that takes two String arguments uses all the boolean
* comparisons to compare the two Stings and print the results. For the == and
* !=, also perform the equals() test. In main(), test your method with some
* different String objects.
*/


public class Exercise14 {	
	static void f(boolean b) {
		if(b == true) 
			System.out.println(true);
		else 
			System.out.println(false);
	}
	static void stringTest(String s, String t) {
		f(s == t);
		f(s.equals(t));
		f(t.equals(s));
		f(s != t);
	}	
	public static void main(String[] args) {
		String s = "one", t = "two";
		Exercise14.stringTest(s, t);		
	}
} 
