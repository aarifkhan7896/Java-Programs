class Over{
	int a,b;
	void add(int x) {
		a=x;
		System.out.println("Square is: "+(a*a));
	}
	void add(int x,int y) {
		a=x;
		b=y;
		System.out.println("Addition is: "+(a+b));
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over obj = new Over();
		obj.add(5);
		obj.add(10, 200);
	}

}
