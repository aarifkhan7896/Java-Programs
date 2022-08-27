
public class SubtractionOfMatrices {
	public static void main(String[] args) {
		int a[][] = {
				{
					1,2,3
				},{
					5,4,7
				}
		};
		int b[][]= {
				{
					1,4,5
				},{
					5,8,6
				}
		};
		int c[][]=new int[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
