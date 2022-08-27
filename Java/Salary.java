import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sal,b;
		System.out.println("Enter your Salary: ");
		Scanner obj = new Scanner(System.in);
		sal=obj.nextInt();
		if(sal>=10000)
		{
			b=(sal*10)/100;
			sal=sal+b;
		}
		System.out.println("Your Salary after bonus is : "+sal);
	}

}
