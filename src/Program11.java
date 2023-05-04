public class Program11 {

	public static void main(String[] args) {
		int l=args.length;
		int [][]a=new int[9][9];
		if(l<9) {
			System.out.println("Please enter 9 integer numbers");
		}
		if(l==9) {
			int k=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("The given array is : ");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.print("\n");
			}
			int max=0;
			System.out.println("The maximum array element is : ");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(max<a[i][j]) {
						max=a[i][j];
					}
				}
			}
			System.out.println(max);
		}
	}
}

