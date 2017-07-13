package org.Mont;

public class euclidesAlgoritmo {
	
	public static int gcd( int a, int b ) {
	    final int gcd;
	    if (b != 0) {
	        //final int q = a / b;
	        final int r = a % b; // a == r + q * b AND r == a - q * b.
	        gcd = gcd( b, r );
	    } else {
	        gcd = a;
	    }
	  
	    return gcd;
	}

}
