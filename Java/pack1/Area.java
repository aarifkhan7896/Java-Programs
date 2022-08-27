package pack1;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=10;
		int w=20;
		float r = 2.5f;
		
		int rect=area(10,50);
		float circ=area(r);
		System.out.println("rect: "+rect);
		System.out.println("circ: "+circ);
	}
public static int area(int n1,int n2) {
	int result = n1*n2;
	return result;
}

public static float area(float r ) {
	float result = 3.14f*r*r;
	return result;
}
}
