// File: PersonV2.java
//
// Author: Rahul Simha
// Created: Sept 16, 1998
// Modified: Sept, 2008
//
// Illustrates inheritance (also see Person.java).

class PersonV2 extends Person {

  // New data.
  int age;

  // New constructor.
  public PersonV2 (String nameIn, String ssnIn, int ageIn)
  {
    name = nameIn;
    ssn = ssnIn;
    age = ageIn;
  }

  // New accessor function
  public int getAge ()
  {
    return age;
  }

  // Testing.
  public static void main (String[] argv)
  {
    PersonV2 p = new PersonV2 ("Elaine", "333-33-4567", 35);
    System.out.println (p + ", age=" + p.getAge());
  }

}
