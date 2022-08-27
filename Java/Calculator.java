import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double n1,n2,result;
		char ch;
		System.out.println("Enter First Number: ");
		n1=scan.nextDouble();
		System.out.println("Choose an operator: +, -, *, or /");
		ch=scan.next().charAt(0);
		System.out.println("Enter Second Number: ");
		n2=scan.nextDouble();
		
		
		switch(ch) {
		case '+':
			result = n1+n2;
			System.out.println(result);
			break;
		case '-': 
			result = n1-n2;
			System.out.println(result);
			break;
		case '/':
			result = n1/n2;
			System.out.println(result);
			break;
		case '*':
			result = n1*n2;
			System.out.println(result);
			break;
		default:System.out.println("Enter Valid Numbers");
			break;
		}
	}

}
