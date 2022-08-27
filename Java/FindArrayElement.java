import java.util.*;
public class FindArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num=1;
		int a[] = new int[100];
		for(int j=0;j<a.length;j++) {
			a[j]=num;
			num++;
		}
		System.out.println("Enter number from 1 to 100 to find: ");
		int toFind = scan.nextInt();
		int index = -1;
		boolean bool = false;
		
		for(int i=0;i<a.length;i++) {
			if(toFind==a[i]) {
				index=i;
				bool = true;
				break;
			}
		}
		if(bool==true) {
			System.out.println(toFind+" is present at index "+index);
		}else {
			System.out.println("Element not available");
		}
	}

}
