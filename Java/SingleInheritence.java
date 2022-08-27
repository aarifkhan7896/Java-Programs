class A{
	int a,b,c;
	void getdata(int x, int y) {
		a=x;
		b=y;
	}
	
	int add() {
		System.out.println("Addition is: ");
		return a+b;
	}
}

class B extends A{
	int mult() {
		System.out.println("Multiplication is: ");
		return a*b;
	}
}
public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		int add, mult;
		obj.getdata(10, 20);
		add = obj.add();
		mult = obj.mult();
		System.out.println("Addition: "+add);
		System.out.println("Multiplication : "+mult);
	}

}
