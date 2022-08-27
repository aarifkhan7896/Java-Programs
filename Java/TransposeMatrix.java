
public class TransposeMatrix {
	public static void main(String[] args) {
		int a[][] = {
				{
					1,2,3
				},{
					2,5,8
				}
		};
		int b[][]=new int[3][2];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
