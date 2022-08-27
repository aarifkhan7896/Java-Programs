package pack1;

public class GreatestCommonDivisor {
	static int gcd(int a,int b) {
		if(a==b)
			return(0);
		if(a%b==0)
			return(b);
		if(b%a==0)
			return(a);
		if(a>b)
			return(gcd(a%b,b));
		else
			return(gcd(a,b%a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GCD is: "+gcd(105,91));
	}
}
