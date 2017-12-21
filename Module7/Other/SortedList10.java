// File: SortedList10.java
//
// Author: Rahul Simha
// Created: Sept 29, 1998
//
// Multiple interfaces.

import java.util.*;

// An interface for enumerating in either direction.
// Note: the keyword "abstract" is not required
// but recommended.

interface TwoWayEnumeration {
    public abstract void setForward ();
    public abstract void setBackward ();
    public abstract boolean hasMoreElements();
    public abstract Object nextElement();
}

abstract class ComparableObject {
    public abstract String toString ();
    public abstract int compare (ComparableObject c);
}

class ListItem {

    ComparableObject data = null; 
    ListItem next = null;
    ListItem prev = null;
    
    // Constructor.
    public ListItem (ComparableObject obj, ListItem p, ListItem n)
    {
	data = obj;  next = n;  prev = p;
    }
    
}


// Linked list class - implements two interfaces.

class LinkedList implements Enumeration, TwoWayEnumeration {

    ListItem front = null;
    ListItem rear = null;
    int numItems = 0;      // Current number of items.
    
    // Instance method to add a data item.
    public void addData (ComparableObject obj)
    {
	if (front == null) {
	    front = new ListItem (obj, null, null);
	    rear = front;
	}
	else {
	    // Find the right place.
	    ListItem tempPtr = front;
	    boolean found = false;
	    while ( (!found) && (tempPtr != null) ) {
		if (tempPtr.data.compare(obj) > 0) {
		    found = true;
		    break;
		}
		tempPtr = tempPtr.next;
	    }
	    // Now insert.
	    if (!found) { // Insert at rear.
		rear.next = new ListItem (obj, rear, null);
		rear = rear.next;
	    }
	    else if (tempPtr == front) { // Insert in front.
		front.prev = new ListItem (obj, null, front);
		front = front.prev;
	    }
	    else { // Insert in the middle.
		ListItem Lptr = new ListItem (obj, tempPtr.prev, tempPtr);
		tempPtr.prev.next = Lptr;
		tempPtr.prev = Lptr;
	    }
	}
	numItems++;
    }

    ListItem enumPtr;
    boolean forward = true;

    // Method from TwoWayEnumeration interface.
    public void setForward ()
    {
	forward = true;
	enumPtr = front;
    }
    
    // Method from TwoWayEnumeration interface.
    public void setBackward ()
    {
	forward = false;
	enumPtr = rear;
    }
    
    // Method in both interfaces.
    public boolean hasMoreElements ()
    {
	if (enumPtr == null)
	    return false;
	else 
	    return true;
    }

    // Method in both interfaces.
    public Object nextElement() 
    {
	Object obj = enumPtr.data;
	if (forward) 
	    enumPtr = enumPtr.next;
	else
	    enumPtr = enumPtr.prev;
	return obj;
    }

    // Return an Enumeration instance.
    public Enumeration getEnumeration ()
    {
	setForward();
	return this;  
    }

    // Return a TwoWayEnumeration instance.
    public TwoWayEnumeration getEnumeration (boolean f)
    {
	forward = f;
	if (forward)
	    setForward();
	else
	    setBackward();
	return this;
    }

} // End of class "LinkedList"


// An object to use in the list:

class Person extends ComparableObject {

    String name;
    String ssn;

    // Constructor.
    public Person (String nameInit, String ssnInit)
    {
	name = nameInit;  ssn = ssnInit;
    }
    
    // Override toString()
    public String toString ()
    {
	return "Person: name=" + name + ", ssn=" + ssn;
    }
    
    // Must implement compare
    public int compare (ComparableObject obj)
    {
	Person p = (Person) obj;
	return name.compareTo (p.name);
    }

} // End of class "Person"


// Test class.

public class SortedList10 {

    public static void main (String[] argv)
    {
	// Create a new list object.
	LinkedList L = new LinkedList ();

	// Add data.
	L.addData (new Person ("Rogue", "1111-12-1212"));
	L.addData (new Person ("Storm", "222-23-2323"));
	L.addData (new Person ("Black Widow", "333-34-3434"));
	L.addData (new Person ("Jean Grey", "888-89-8989"));
	
	// Print via regular Enumeration
	Enumeration e = L.getEnumeration();
	while (e.hasMoreElements())  {
	    Person p = (Person) e.nextElement();
	    System.out.println (p);
	}
	
	// Get a 2-way enumeration.
	TwoWayEnumeration e2 = L.getEnumeration (false);
	while (e.hasMoreElements()) {
	    Person p = (Person) e.nextElement();
	    System.out.println (p);
	}
	
    }

} // End of class "SortedList10"



