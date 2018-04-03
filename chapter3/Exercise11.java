/* Start with a number that has a binary one in the most significant position
* (hint: Use a hexadecimal constant). Using the signed right-shift operator,
* right shift it all the way through all of its binary positions each time
* displaying the result using Integer.toBinaryString().
*/ 

public class Exercise11 {
	public static void main(String[] args) {
		int h = 0x10000000;
		
		System.out.println(Integer.toBinaryString(h));
		for(int i = 0; i < 29; i++) {
			h >>>= 1;
			System.out.println(Integer.toBinaryString(h));
		}
	}
}