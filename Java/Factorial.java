
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int number = 5;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " +number+ " is: "+fact);	
	}

}
//num*fact(num-1) for recursion