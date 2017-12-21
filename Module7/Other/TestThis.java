// File: TestThis.java (Module 7)
//
// Author: Rahul Simha
// Created: October 2, 1998
//
// Illustrates "this".

class ObjA {
  int x;
  void selfExamine ()
  {
    System.out.println (this);
  }
}

class ObjB {
  int x;
  public ObjB (int x)
  {
    this.x = x;
  }
}

class ObjC {
  String[] names;
  public ObjC (String[] names)
  {
    this.names = new String[names.length];
    for (int i=0; i < names.length; i++)
      this.names[i] = names[i];
  }
  public String toString()
  {
    String s = "";
    for (int i=0; i < names.length; i++)
      s += (names[i] + " ");
    return s;
  }

  void assign (ObjC a)
  {
    if (this == a) {
      System.out.println ("No assignment made");
      return;
    }
    this.names = new String[a.names.length];
    for (int i=0; i < a.names.length; i++)
      names[i] = a.names[i];
  }
}

class Complex {

  double real;
  double imag;

  public Complex ()
  {
    this (0, 0);
  }

  public Complex (double real)
  {
    this (real, 0);
  }

  public Complex (double real, double imag)
  {
    this.real = real;
    this.imag = imag;
  }
}


public class TestThis {
  public static void main (String[] argv)
  {
    ObjA a = new ObjA ();
    System.out.println (a);
    a.selfExamine();

    String[] badDays = {"Monday", "Tuesday", "Wednesday", 
			 "Thursday", "Friday"};
    ObjC c = new ObjC (badDays);
    System.out.println (a);

    String[] goodDays = {"Saturday", "Sunday"};
    ObjC c2 = new ObjC (goodDays);
    System.out.println (c2);
    c.assign (c2);
    System.out.println (c);
    c.assign (c);
  }
}
