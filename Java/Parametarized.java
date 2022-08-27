class Test2{
	int res,len,wid;
	
	Test2(int x,int y){
		len=x;
		wid=y;
	}
	void disp() {
		res = len*wid;
		System.out.println("area of a rectangle is: "+res);
	}
}
public class Parametarized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2(7,5);
		obj.disp();
	}

}
