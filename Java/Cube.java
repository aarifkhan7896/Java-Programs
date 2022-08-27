import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scan.nextInt();
		
		System.out.println("Cube is : "+num*num*num);
		
//		for(int i=1;i<=num;i++) {
//			System.out.println(i*i*i);
//		}
	}
}
