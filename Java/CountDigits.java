import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		int i = scan.nextInt();
		int count =0;
		for(;i != 0;i/=10,count++) {
			
		}
		System.out.println("The number of digits are: "+count);
	}
}
