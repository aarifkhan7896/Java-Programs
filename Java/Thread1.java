class A1 extends Thread{
	public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("A1: "+i);
	}
	System.out.println("Ends");
}
}

class B1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("B1:"+i);
		}
		System.out.println("Ends");
	}
}
public class Thread1 {
	public static void main(String[] args) {
		A1 obj = new A1();
		B1 obj1 = new B1();
		obj.start();
		obj1.start();
	}
}
