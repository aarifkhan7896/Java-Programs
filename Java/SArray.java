
public class SArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		
		for(int i=0;i<5;i++) {
			a[i]=i;
		}
		
		for(int i=0;i<5;i++) {
			b[i]=num;
			++num;
		}
		System.out.println("Values of Array A:");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Value of Array B:");
		for(int i=0;i<5;i++) {
			System.out.println(b[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			c[i]=b[i]+a[i];
		}
		System.out.println();
		System.out.println("Values of Array C:");
		for(int i=0;i<5;i++) {
			System.out.println(c[i]+" ");
		}
	}

}
