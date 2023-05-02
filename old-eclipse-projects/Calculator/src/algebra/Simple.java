package algebra;

import java.math.*;

public class Simple {
	
	public static BigDecimal factorial(double a) {
		BigDecimal num = new BigDecimal("1");
		BigDecimal newA = new BigDecimal(a);
		
		for(int i = (int)a; i > 0; i--) {
			num = num.multiply(newA);
			newA = newA.subtract(new BigDecimal("1"));
		}
		
		return num;
	}
}
