// File: UniformRandom2.java
// Author: Rahul Simha
// Created: Aug, 1998.
// Modified: Aug, 2017
//
// Uniform random number generator with set_seed function.
import java.lang.Math;
public class UniformRandom2 {

    // "Global" variable - the seed, set to some 
    // arbitrary non-zero value.
    static long r_seed = 12345678L; 

    // Basic Lehmer generator - constants
    static final long m = 2147483647L;
    static final long a = 48271L;
    static final long q = 44488L;
    static final long r = 3399L;
    
    // Basic Lehmer generator - uniform[0,1]
    // For more information see Knuth, Vol. II.
    public static double uniform ()
    {
	long hi = r_seed / q;
	long lo = r_seed - q * hi;
	long t = a * lo - r * hi;
	if (t > 0)
	    r_seed = t;
	else
	    r_seed = t + m;
	return ( (double) r_seed / (double) m );
    }

    // Set the seed to any given value.
    public static void setSeed (long value)
    {
	r_seed = value;
    }
    public static double computeArea(double radius) {
	double area;
	area = (Math.PI) * Math.pow(radius,2);
	return area;
	}
    

    public static void main (String[] argv)
    {
	setSeed (13579);
	double sum = 0;
	double sum1 = 0;
	for (int i=1; i<=10000; i++)
	    sum += uniform ();
	    sum1 += computeArea(sum);	
	System.out.println ("Average of area of  10000 circles: " + (sum1/10000)/10000);
    
	}
}
