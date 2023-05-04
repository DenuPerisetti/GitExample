
import java.util.*;
public class MinMax
{
public static void main(String[] args) {
   int n;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   int[] a= new int[n];
   for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
   }
   int min=a[0],max=a[0];
   for(int i=0;i<n;i++){
       if(a[i]<min){
           min=a[i];
       }
       if(a[i]>max){
           max=a[i];
       }
   }
   System.out.println("Minimum of array elements : "+min);
   System.out.println("Maximum of array elements : "+max);
}
}