import java.util.*;
class Condition{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = scan.nextInt();
		if(((year%400==0 && year%100 != 0)) || (year%4==0)) {
			System.out.println("leap year");
		}else {
			System.out.println("Not a leap year");
		}
	}
}