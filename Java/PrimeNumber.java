import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scan.nextInt();
		boolean bool = false;
		for(int i=2;i<=num/2;i++) {
			if(num%2==0) {
				bool=true;
				break;
			}
		}
		if(!bool) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a prime number");
		}
	}
}
