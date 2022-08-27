import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double p,r,t;
		System.out.println("Enter Principle: ");
		p=scan.nextDouble();
		System.out.println("Enter Rate: ");
		r=scan.nextDouble();
		System.out.println("Enter Time: ");
		t=scan.nextDouble();
		System.out.println((p*t*r)/100);
	}
}
