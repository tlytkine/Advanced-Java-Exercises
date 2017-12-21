// File: TestStatic.java (Module 7)
//
// Author: Rahul Simha
// Created: October 1, 1998
//
// Illustrates static initializers.

class StaticObj {
  static int A[];
  public static void init()
  {
    A = new int[2];
    A[0] = 10;
    A[1] = 20;
  }
  static {
    init();
  }
  public static void printA ()
  {
    for (int i=0; i < A.length; i++)
      System.out.println (A[i]);
  }
}

public class TestStatic {
  public static void main (String[] argv)
  {
    StaticObj.printA();
  }
}
