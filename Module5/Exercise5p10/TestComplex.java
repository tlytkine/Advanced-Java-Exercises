
class Complex {
  // FILL IN YOUR CODE HERE.
        static double RealPart;
        static double ImagPart;
        double Magnitude;
        double magSum;
        
        public Complex() {
	    RealPart = 0.0;
	    ImagPart = 0.0;
 	}

	void setValue(double x, double y) {
	    RealPart = x;
	    ImagPart = y;
	    Magnitude = Math.sqrt((x*x)+(y*y));
	}

	double getRealPart() {
	    return RealPart;
	}

	double getImagPart() {
	    return ImagPart;
	}

	double getMagnitude() {
	    return Math.abs(Magnitude);
	}
	
}

public class TestComplex {

  public static void main (String[] argv)
  {
    Complex c1 = new Complex();
    c1.setValue (1.0, 1.0);

    System.out.println ("c1's real part = " + c1.getRealPart()
                        + "\n" +
                        "c1's imag part = " + c1.getImagPart());
    System.out.println ("|c1| = " + c1.getMagnitude());

    Complex c2 = new Complex();
    c2.setValue (6.0, 8.0);

    System.out.println ("c2's real part = " + c2.getRealPart()
                        + "\n" +
                        "c2's imag part = " + c2.getImagPart());
    System.out.println ("|c2| = " + c2.getMagnitude());

    double magSum = c1.getMagnitude() + c2.getMagnitude();
    System.out.println ("|c1| + |c2| = " + magSum);
  }
}
