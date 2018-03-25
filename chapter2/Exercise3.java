// Find the code fragments involving ATypeName and turn them into a program that compiler and runs

class Exercise3 {
	public static void main(String[] args) {
	    class ATypeName {
	    	void show() {
	    		System.out.println("hello");
	    	}
	    }
	    ATypeName a = new ATypeName();
	    a.show();
	}
}