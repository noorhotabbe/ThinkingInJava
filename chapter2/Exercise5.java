// Modify the previous exercise so that the values of the data in DataOnly are
// assigned to and printed in main().

class Exercise5 {
	public static void main(String[] args) {
	    class DateOnly {
	    	int i;
	    	void show() {
	    		System.out.println("hello");
	    		System.out.println("i" + i);
	    	}
	    }
	    DateOnly a = new DateOnly();
	    a.i = 10;
	    a.show();
	}
}