class Ban{
	int a;
	void disp() {
		System.out.println("Score is: "+a);
	}
}
class An extends Ban{
	int a;
	void getdata(int x, int y)
	{
		super.a=x;
		a=y;
	}
	void disp() {
		super.disp();
		System.out.println("An value is :"+a);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		An obj = new An();
		obj.getdata(11, 21);
		obj.disp();
	}

}
