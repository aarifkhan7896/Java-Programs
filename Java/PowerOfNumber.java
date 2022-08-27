
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double base=3,exponent=4,result=Math.pow(base, exponent);
//		System.out.println(result);
		int base = 3, exponent = 4;

	    long result = 1;

	    for (; exponent != 0; --exponent) {
	      result *= base;
	    }

	    System.out.println("Answer = " + result);
	}

}
