class Test1{
	int a,b;
	Test1(){
		a=5;
		b=4;
	}
	void disp() {
		System.out.println("Numbers are: "+a+" & "+b);
		System.out.println("Addition is: "+(a+b));
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1();
		obj.disp();
	}
}
