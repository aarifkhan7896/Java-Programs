import java.util.*;
public class Lcm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1,n2,lcm;
		System.out.println("Enter first number: ");
		n1=scan.nextInt();
		System.out.println("Enter second number: ");
		n2=scan.nextInt();
		lcm = (n1>n2)?n1:n2;
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println("LCM: "+lcm);
				break;
			}
			++lcm;
		}
	}
}

