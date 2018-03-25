// Write a program that includes and calls the storage() method defined as a
// code fragment in this chapter.

class Exercise5 {
	public static void main(String[] args) {
	    class StoreStuff {
			int storage(String s) {
				return s.length() * 2;
			}	
		}
	    StoreStuff a = new StoreStuff();
	    System.out.println(a.storage("hello"));
	}
}