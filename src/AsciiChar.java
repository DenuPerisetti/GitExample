import java.util.Scanner;

public class AsciiChar {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			char c=(char)a[i];
			System.out.print(c+" ");
		}
		
	}

}
