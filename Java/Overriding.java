class Method{
	int a=10;
	void disp() {
		System.out.println("Value of a is: "+a);
	}
}

class MethodOverriding extends Method{
	void disp() {
//		System.out.println("Value of a is: "+a);
		System.out.println("Value of a x a: "+(a*a));
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding obj = new MethodOverriding();
		obj.disp();
	}

}
