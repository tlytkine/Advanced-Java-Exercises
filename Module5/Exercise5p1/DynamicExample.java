
class ObjX {

    // No "static" keyword for either member.

    int i;
    int test;

    void print ()
    {
	System.out.println ("i=" + i);
    }
    void printNew () 
    {
        System.out.println ("test=" + test);
    }

}


public class DynamicExample {

    public static void main (String[] argv)
    {
        // First create an instance, which allocates space from the heap.
	ObjX x = new ObjX (); 

        // Now access members via the variable and the dot-operator.
	x.i = 5;
	x.test = 6;
	x.print();
	x.printNew();
    }

}
