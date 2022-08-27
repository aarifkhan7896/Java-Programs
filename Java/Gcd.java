import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter first number: ");
		n1=scan.nextInt();
		System.out.println("Enter second number: ");
		n2=scan.nextInt();
		while(n1 != n2) {
			if(n1>n2) {
				n1=n1-n2;
			}else {
				n2=n2-n1;
			}
		}
		System.out.println("HCF: "+n1);
	}
}