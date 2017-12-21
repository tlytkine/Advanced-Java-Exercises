
class Complex {
  // FILL IN YOUR CODE
    double RealPart;
    double ImagPart;
    double Magnitude;
    String ComplexNum;
    public Complex() {
	RealPart = 0.0;
        ImagPart = 0.0;
    }
    public Complex(double a, double b) {
	RealPart = a;
        ImagPart = b;
    }
    public String toString() 
    {
    ComplexNum = (Double.toString(RealPart) + "  +  " + Double.toString(ImagPart) + "i");
    return ComplexNum;
    
    }
    public Complex(double a) {
	RealPart = a;
        ImagPart = 0.0;
	}
    public double getRealPart() {
         
	// returns a 
         return RealPart;

    }
    public double getImagPart() {
        // returns bi
        return ImagPart;
    }
    public double getMagnitude() {
    Magnitude = Math.sqrt(Math.pow(RealPart,2)+Math.pow(ImagPart,2));    
    // magnitude = sqrt(RealPart^2 + ImagPart^2)
        return Magnitude; 
    }
    public Complex add(Complex x){
    Complex y4 = new Complex();
    y4.RealPart = this.RealPart + x.RealPart;
    y4.ImagPart = this.ImagPart + x.ImagPart;
    return y4; 
   } 
    public Complex multiply(Complex x){
    Complex y5 = new Complex();
    y5.RealPart = this.RealPart * x.RealPart;
    y5.ImagPart = this.ImagPart * x.ImagPart;
    return y5;
    }
}
public class TestComplex {

  public static void main (String[] argv)
  {
    Complex c1 = new Complex();
    Complex c2 = new Complex (4.35, 9.002);
    Complex c3 = new Complex (8.93);
   
    System.out.println ("c1's real part = " + c1.getRealPart()
                        + "\n" +
                        "c1's imag part = " + c1.getImagPart());
    System.out.println ("|c1| = " + c1.getMagnitude());


    System.out.println ("c2's real part = " + c2.getRealPart()
                        + "\n" +
                        "c2's imag part = " + c2.getImagPart());
    System.out.println ("|c2| = " + c2.getMagnitude());

    double magSum = c1.getMagnitude() + c2.getMagnitude();
    System.out.println ("|c1| + |c2| = " + magSum);
    
    System.out.println ("");
    Complex c4 = c1.add(c2);
    Complex c5 = c2.multiply(c3);
    Complex c6 = new Complex (4.35, 9.002);
    System.out.println ("c6 = " + c6);  
}
}
