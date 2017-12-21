// File: Person.java
//
// Author: Rahul Simha
// Created: Sept 16, 1998
// Modified: Sept, 2008
//
// Illustrates inheritance: also see Person2

public class Person {

  // Data
  String name;
  String ssn;

  // Constructors.
  public Person (String nameIn, String ssnIn)
  {
    name = nameIn;  ssn = ssnIn;
  }

  public Person ()
  {
    name = ssn= "Not initialized";
  }

  // Accessors.
  public String getName ()
  {
    return name;
  }

  public String getSSN ()
  {
    return ssn;
  }

  public String toString ()
  {
    return "Person: Name=" + name + ", ssn=" + ssn;
  }

  // Testing:
  public static void main (String[] argv)
  {
    Person p = new Person ("George", "111-11-1234");
    System.out.println (p);
  }

} // End of class "Person"
