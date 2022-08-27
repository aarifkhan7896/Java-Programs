
public class MaxNumberArray {
	public static void main(String[] args) {
		int a[] = {
				77,2000,3,5,46,8,99
		};
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
