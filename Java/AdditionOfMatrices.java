
public class AdditionOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{
					1,2,3
				},{
					4,5,6
				}
		};
		int b[][] = {
				{
					9,8,7
				},{
					7,4,1
				}
		};
		int c[][] = new int[2][3];
		
		System.out.println("Matrices beforea addition 1: ");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrices beforea addition 2:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrices after addition: ");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
