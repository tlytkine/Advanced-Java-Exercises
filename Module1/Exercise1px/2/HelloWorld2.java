// File: HelloWorld2.java
// Author: Rahul Simha
//
// Note how in-line comments start with //
// I will follow the above convention of filename, author etc.

public        // Accessible outside this file. "public" is a reserved word.
  class       // "class" is a reserved word.
  HelloWorld2 // The name of the class - same name as filename.

{             // Braces instead of begin/end.

  public      // This function must be accessible. "public" is reserved.
    static    // "static" is reserved.
    void      // The return value - nothing. "void" is reserved.
    main      // To start execution, a class must have a "main" function.
              // "main" is sort-of reserved.
    (String[] argv)  
       // Command line parameters are placed by the run-time system
       // in argv[0], argv[1], etc.
  {

    System.out.println ("Hello World!");
    // System.out is an object that contains a useful function
    // called println, which takes in a string and prints it out on
    // a new line.

    System.out.println ("Here's the list of arguments you gave me:");

    for (int i=0; i < argv.length; i++)
      System.out.println ("Argument#" + i + ": " + argv[i]);
    // Notice how strings can be concatenated with the `+' operator.
    // Is `i' a string or a variable?

    System.out.println ("Bye!");

  }

}
  
/*
Exercise 1.2 Try executing this once as:

Timothys-MacBook-Pro:Module1 timothylytkine$ pico HelloWorld2.java 
Timothys-MacBook-Pro:Module1 timothylytkine$ javac HelloWorld2.java
Timothys-MacBook-Pro:Module1 timothylytkine$ java HelloWorld2 
Hello World!
Here's the list of arguments you gave me:
Bye!
Timothys-MacBook-Pro:Module1 timothylytkine$ java HelloWorld2 I dont know whats going on
Hello World!
Here's the list of arguments you gave me:
Argument#0: I
Argument#1: dont
Argument#2: know
Argument#3: whats
Argument#4: going
Argument#5: on
Bye!
*/
