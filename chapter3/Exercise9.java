// Display the largest and smallest numbers fo both float and double 
// exponential notation.

public class Exercise9
{
	public static void main(String[] args) {
		double max = java.lang.Double.MAX_VALUE;
		System.out.println("Max double = " + max);
		double min = java.lang.Double.MIN_VALUE; 
		System.out.println("Min double = " + min);
		float maxf = java.lang.Float.MAX_VALUE;
		System.out.println("Max float = " + maxf);
		float minf = java.lang.Float.MIN_VALUE; 
		System.out.println("Min float = " + minf);	
	}
}