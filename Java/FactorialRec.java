class FactorialRec{
	static int factorial(int n) {
		if(n==0)
			return(1);
		else
			return(n*factorial(n-1));
	}
	public static void main(String[] args) {
		 int fact=1;  
		  int num=4;//It is the number to calculate factorial    
		  fact = factorial(num);   
		  System.out.println("Factorial of "+num+" is: "+fact); 
	}
}