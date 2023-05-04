import java.util.*;
public class RepeatingValue {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				if(count>max) {
					max=a[j];
				}
			
			}
		}
		System.out.println(max);
		// TODO Auto-generated method stub
	}

}
