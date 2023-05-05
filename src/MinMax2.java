import java.util.Scanner;

public class MinMax2 {

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
		for(int i=0;i<n;i++){
			System.out.println("Minimum of 2 elements : "+a[0]+","+a[1]);
			System.out.println("Maximum of 2 elements : "+a[n-2]+","+a[n-1]);
			break;
		}
		
		// TODO Auto-generated method stub

	}

}
