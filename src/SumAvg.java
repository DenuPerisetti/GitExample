import java.util.*; 
public class SumAvg { 
	public static void main(String[] args) {
		int n; 
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt(); 
		int sum=0; 
		int[] a= new int[n]; 
		for(int i=0;i<n;i++){ 
			a[i]=sc.nextInt(); 
			} 
		for(int i=0;i<n;i++){ 
			sum=sum+a[i]; 
			} 
		System.out.println("Sum of array elements : "+sum); 
		int c=sum/n; 
		System.out.println("Average of array elements : "+c); 
		}
}
