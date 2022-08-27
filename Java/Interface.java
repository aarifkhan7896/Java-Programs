interface Acb{
	int roll=10;
	void dispa();
}
interface Acb2{
	void dispb();
}

class Cat implements Acb,Acb2{
	public void dispa() {
		System.out.println("Roll no: "+roll);
	}
	public void dispb() {
		System.out.println("Roll no: "+(roll+1));
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj = new Cat();
		obj.dispa();
		obj.dispb();
	}

}
