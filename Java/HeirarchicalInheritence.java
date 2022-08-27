class Aa{
	int a=10, b=3;
	void add() {
		System.out.println("addition is:"+(a+b));
	}
}

class Ba extends Aa{
	void mul() {
		System.out.println("multiplication is: "+(a*b));
	}
}

class C extends Aa{
	void sum() {
		System.out.println("sum is: "+((a*a)+(b*b)));
	}
}
public class HeirarchicalInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ba obj1 = new Ba();
		C obj = new C();
		obj.sum();
		obj1.mul();
		obj1.add();
	}

}
