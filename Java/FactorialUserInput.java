import java.util.Scanner;
public class FactorialUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int fact=1;
		System.out.println("Enter Number: ");
		long n = scan.nextLong();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
	}
}
