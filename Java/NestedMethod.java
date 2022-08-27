class Example{
	int a,b;
	Example(int x, int y){
		a=x;
		b=y;
	}
	
	int largest() {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	void disp() {
		int ans = largest();
		System.out.println("Largest number is: "+ans);
	}
}
public class NestedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj = new Example(20,200);
		obj.disp();
	}

}
