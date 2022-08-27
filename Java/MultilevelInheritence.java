class First{
	int a;
	void getmarks(int x) {
		a=x;
	}
	void putmarks() {
		System.out.println("marks: "+a);
	}
}

class Second extends First{
	int x,y;
	
	void num(int m1, int m2) {
		x=m1;
		y=m2;
	}
	void putnum() {
		System.out.println("first number is :"+x);
		System.out.println("second number is :"+y);
	}
}

class Third extends Second{
	int total;
	void total() {
		putmarks();
		putnum();
		total=x+y;
		System.out.println("total is: "+total);
	}
}
public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third obj = new Third();
		obj.getmarks(10);
		obj.num(11,3);
		obj.total();
		
	}

}
