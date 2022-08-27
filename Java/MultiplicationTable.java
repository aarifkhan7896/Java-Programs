import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("Enter Number: ");
		for(int i=1;i<=10;i++) {
			System.out.println(i+" x "+num+" = "+num*i);
		}
	}
}
