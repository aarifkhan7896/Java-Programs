class Student1 {
	int m1,m2;
	void getdata(int x,int y) {
		m1=x;
		m2=y;
	}
	void putdata() {
		System.out.println("First Marks: "+m1);
		System.out.println("Second Marks: "+m2);
	}
}

interface sport{
	int a=6;
	void sp();
}

class Result extends Student1 implements sport{
	public void sp() {
		System.out.println("Sport Marks: "+a);
	}
	
	void disp() {
		putdata();
		sp();
		
		int total = m1+m2+a;
		System.out.println("Total marks: "+total);
	}
}
public class MultipleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result obj = new Result();
		obj.getdata(1,2);
		obj.disp();
	}

}
