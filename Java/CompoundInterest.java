import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double p,r,t;
		System.out.println("Enter Principle: ");
		p=scan.nextDouble();
		System.out.println("Enter Rate: ");
		r=scan.nextDouble();
		System.out.println("Enter Time: ");
		t=scan.nextDouble();
		
		double ci = p*(Math.pow(1+r/100, t));
		System.out.println(ci);
	}	
}
	