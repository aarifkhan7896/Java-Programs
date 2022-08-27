import java.util.Scanner;
class Aaa{
	int a,b;
	void add(int x,int y) {
		a=x;
		b=y;
	}
	void dis() {
		System.out.println("Addition is: "+ (a+b));
	}
}
class Baa extends Aaa{
	void mul(int x,int y) {
		super.a=x;
		int b=y;
	}
	void disp() {
//		super.disp();
		System.out.println("Multiplication is: "+(a*b));
	}
}
public class Test {

	public static void main(String[] args) {
		Baa obj = new Baa();
		obj.add(1, 2);
		obj.mul(2, 3);
		obj.disp();
		obj.dis();
	} 
}
