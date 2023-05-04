import java.util.*;
public class Findele
{
public static void main(String[] args) {
   int n;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   int[] a= new int[n];
   for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
   }
   int ele=sc.nextInt();
   for(int i=0;i<n;i++){
       if(a[i]==ele){
           System.out.println("Element found in the index : "+i);
           break;
       }
       if((a[i]!=ele)&&(i==n-1)){
           System.out.println("-1");
           
       }
   }
   
}
}