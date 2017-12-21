// File: StaticExample.java
//
// Author: Rahul Simha
// Created: August 19, 1998
// Modified: 2007
//
// Illustrates a static class.
/*
Exercise 4.1: In StaticExample.java add a second data member (say, another int)
to Static Example. Then, in main, assign a value to the new variable and print
it 
*/

public class StaticExample {
    static int test;
    static double x;                      // Static data
    
    static void printx ()                 // Static method
    {
        System.out.println ("x = " + x);
    }

    public static void main (String[] argv)
    {
	test = 5;
        x = 5.34;
        printx ();
	System.out.println("Value of second data member in Static Example:");
	System.out.println("test = " + test);
    }

}
