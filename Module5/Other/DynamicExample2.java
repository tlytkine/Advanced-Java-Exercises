
class ObjX {

    // No "static" keyword for either member.

    int i;

    void print ()
    {
	System.out.println ("i=" + i);
    }

}


public class DynamicExample2 {

    // A simple variable declaration.
    static ObjX x;


    public static void main (String[] argv)
    {
        // First create an instance, which allocates space from the heap.
	x = new ObjX (); 

        // Now access members via the variable and the dot-operator.
	x.i = 5;
	x.print();
    }

}
