// File: SortedList.java
//
// Author: Rahul Simha
// Created: Sept 29, 1998
//
// Sorted linked list.

abstract class ComparableObject {
    public abstract int compare (ComparableObject c);
}

class ListItem {

    ComparableObject data = null; 
    ListItem next = null;
    
    // Constructor.
    public ListItem (ComparableObject obj)
    {
	data = obj;  next = null;
    }
    
    // Accessor.
    public ComparableObject getData () 
    {
	return data;
    }
}


// Linked list class - also a dynamic class.

class LinkedList {

    ListItem front = null;
    ListItem rear = null;
    int numItems = 0;      // Current number of items.
    
    // Could this class use a constructor?
    
    // Instance method to add a data item.
    public void addData (ComparableObject obj)
    {
	if (front == null) {
	    front = new ListItem (obj);
	    rear = front;
	}
	else {
	    // Find the right place.
	    ListItem tempPtr=front, prevPtr=front;
	    boolean found = false;
	    while ( (!found) && (tempPtr != null) ) {
		if (tempPtr.data.compare(obj) > 0) {
		    found = true;
		    break;
		}
		prevPtr = tempPtr;
		tempPtr = tempPtr.next;
	    }
	    // Now insert.
	    if (!found) { // Insert at rear.
		rear.next = new ListItem (obj);
		rear = rear.next;
	    }
	    else if (tempPtr == front) { // Insert in front.
		ListItem Lptr = new ListItem (obj);
		Lptr.next = front;
		front = Lptr;
	    }
	    else { // Insert in the middle.
		ListItem Lptr = new ListItem (obj);
		prevPtr.next = Lptr;
		Lptr.next = tempPtr;
	    }
	}
	numItems++;
    }

    public void printList ()
    {
	ListItem listPtr = front;
	System.out.println ("List: (" + numItems + " items)");
	int i = 1;
	while (listPtr != null) {
	    System.out.println ("Item# " + i + ": " 
				+ listPtr.getData());
	    // Must implement toString()
	    i++;
	    listPtr = listPtr.next;
	}
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

public class SortedList {

    public static void main (String[] argv)
    {
	// Create an instance of the list.
	LinkedList L = new LinkedList ();
	
	// Insert data.
	L.addData (new Person ("Rogue", "1111-12-1212"));
	L.addData (new Person ("Storm", "222-23-2323"));
	L.addData (new Person ("Black Widow", "333-34-3434"));
	L.addData (new Person ("Jean Grey", "888-89-8989"));
	
	// Print contents.
	L.printList();
    }

} // End of class "SortedList"
