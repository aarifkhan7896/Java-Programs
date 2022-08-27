import java.util.*;
public class NaturalNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=scan.nextInt();
		int num=0;
		int avg;
		System.out.println("Numbers are: ");
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			num= num+i;
		}
		avg = num/n;
		System.out.println("Sum of Natural Numbers are: "+(num));
		System.out.println("Average: "+(avg));
	}

}
