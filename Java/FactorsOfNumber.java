import java.util.Scanner;
public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println("Factors are: "+i);
			}
		}
	}

}