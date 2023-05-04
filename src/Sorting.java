import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.print("Array in an sorted order:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}