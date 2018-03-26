// write a program demonstrates that, no matter how many objects you create of a particular class
// there is only one instance of a particular static field of that class.

// Turn the Incrementable code fragments into a working program.

class StaticTest1 {
    static int i = 47;
}

class Incrementable1 {
    static void increment() { StaticTest.i++; }
}
class Exercise8 {
    public static void main(String[] args) {
        System.out.println("StaticTest.i= " + StaticTest1.i);
        StaticTest1 st1 = new StaticTest1();
        StaticTest1 st2 = new StaticTest1();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable1 sf = new Incrementable1();
        sf.increment();
        System.out.println("After sf.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable1.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
    }
}