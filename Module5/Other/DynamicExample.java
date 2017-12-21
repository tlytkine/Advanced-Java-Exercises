/* Exercise 5.1: Download DynamicExample.java and add a second data member 
(say, anohter int) to the class ObjX. Then in main, assign a value to the 
new variable and print it. */

class ObjX {

    // No "static" keyword for either member.

    int i;
    int j; 

    void print ()
    {
	System.out.println ("i=" + i);
	System.out.println ("j=" + j);
    }

}


public class DynamicExample {

    public static void main (String[] argv)
    {
        // First create an instance, which allocates space from the heap.
	ObjX x = new ObjX (); 


        // Now access members via the variable and the dot-operator.
	x.i = 5;
	x.j = 6; 
	x.print();
    }

}
