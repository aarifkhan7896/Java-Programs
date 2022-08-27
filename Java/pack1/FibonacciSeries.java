package pack1;
//recursion
public class FibonacciSeries {
	static int fib(int n) {
		if(n==1 || n==2)
			return(1);
		else
			return(fib(n-1)+fib(n-2));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			System.out.println(fib(i));
		}
		System.out.println("6th term is: "+fib(6));
	}

}
