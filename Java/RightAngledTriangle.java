import java.util.*;
public class RightAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a = scan.nextInt();
		System.out.println("Enter Number: ");
		int b = scan.nextInt();
		System.out.println("Enter Number: ");
		int c = scan.nextInt();
		if(a>b&&a>c) {
			if((a*a)==(b*b)+(c*c)) {
				System.out.println("Right Angled Triangle");
			}else {
				System.out.println("No");
			}
		}
	}
}
