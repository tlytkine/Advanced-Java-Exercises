// File: TestCloning3.java (Module 7)
//
// Author: Rahul Simha
// Created: October 1
//
// Proper cloning.

class ObjA implements Cloneable {

    // Data.
    int x = 1;
    int[] A = {2};
    
    // A print method.
    public void print()
    {
	System.out.println ("x=" + x + ", A[0]=" + A[0]);
    }
    
    // Overrides Object's clone()
    public Object clone ()
    {
	ObjA a = new ObjA();
	a.x = x;
	a.A = new int[1];
	a.A[0] = A[0];
	return a;
    }

    public void zeroOut ()
    {
	x = 0;
	A[0] = 0;
    }
}


public class TestCloning3 {

    public static void main (String[] argv)
    {
	ObjA a = new ObjA();
	ObjA a2 = (ObjA) a.clone();
	a.print(); 
	a2.print();
	System.out.println (a);
	System.out.println (a2);
	
	// Consider this experiment:
	a.zeroOut();
	a.print(); 
	a2.print();
	System.out.println (a);
	System.out.println (a2);
    }

}
