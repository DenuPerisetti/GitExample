import java.util.Scanner;

public class Sixandseven {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int i1 = 0,i2=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
			if(a[i]==6) {
				i1=i;
			}
			if(a[i]==7) {
				i2=i;
			}
		}
		if(i1>i2) {
			System.out.println(sum);
		}
		else {
			sum=0;
			for(int i=0;i<n;i++) {
				if(i<i1||i>i2) {
					sum=sum+a[i];
					
				}
			}
			System.out.println(sum);
		}
	}
}