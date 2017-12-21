/*
Exercise 2.3: Write a program that takes in command line arguments, prints out each argument,
the length of each argument and the average length of all the arguments. Name your program
TestCommandLine Here's sample output: 

% java TestCommandLine aaa aaaa
Arg#0 = aaa, length = 3
Arg#1 = aaaa, length = 4
Average: 3.5

*/

import java.io.*;

public class TestCommandLine {

	public static void main(String args[]) {
	int i;
	double totalLength = 0.0;
	double counter = 0.0;
	double average = 0.0;
	for (i = 0; i < args.length; i++) {
	String x = args[i];
	System.out.println("Arg#" + i + " = " + args[i] + ", length = " + x.length());
	totalLength += x.length();
	counter += 1; 
	}
	if ((totalLength > 0) && (counter > 0)) {
	average = totalLength / counter;
	System.out.println("Average: " + average);
	}
	else {
	System.out.println("Please enter command line arguments when executing the program.");
	System.out.println("Ex: java TestCommandLine aaa aaaa"); 
	}
	}
}


