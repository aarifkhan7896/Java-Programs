import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size: ");
		int m=obj.nextInt();
		int marks[] = new int[m];
		System.out.println("Length is: "+marks.length);
		System.out.println("Enter "+m+" Elements: ");
		
		for(int i=0;i<marks.length;i++) { //storing data
			marks[i]=obj.nextInt();
		}
		
		int total=0;
		System.out.println("Elements are: ");
		
		for(int i=0;i<marks.length;i++) { // printing data
			System.out.println(marks[i]);
			total = total+marks[i];
		}
		
		System.out.println("Total are: "+total);
	}
}
