/* Start with a number that is all binary ones. Left shift it, then use the
* unsigned right-shift operator to right shift through all of its binary
* positions, each time displaying the result using Integer.toBinarySting().
*/ 
public class Exercise12 {
	public static void main(String [] args) {
		int h = -1;
		System.out.println(Integer.toBinaryString(h));
		h <<= 10;
		System.out.println(Integer.toBinaryString(h));
		for(int i = 0; i < 32; i++) {
			h >>>= 1;
			System.out.println(Integer.toBinaryString(h));
		}
	}
}