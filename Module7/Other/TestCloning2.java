// File: TestCloning2.java (Module 7)
//
// Author: Rahul Simha
// Created: October 1
//
// Illustrates cloning with the Cloneable interface.

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
	// Must catch exception.
	try {
	    return super.clone();
	}
	catch (CloneNotSupportedException e) {
	    System.out.println (e);
	    return this;
	}
    }

    public void zeroOut ()
    {
	x = 0;
	A[0] = 0;
    }
}


public class TestCloning2 {

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
