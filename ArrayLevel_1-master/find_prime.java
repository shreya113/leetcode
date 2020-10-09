import java.util.*;
public class find_prime 
{
 public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the arrays");
        int n=sc.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS");
        int arr[]=new int[n];
        int i;int p=0,j=0,count=0,x=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            p=arr[i];
            for(j=2;j<=p-1;j++)
            {
               if(p%j==0)
                   count++;
            }
            if(count==0)
            {
                a[x]=arr[i];
            x++;
            }
            count=0;
            p=0;
       
        }
         System.out.println("THE PRIME NUBERS ARE ");
        for(i=0;i<x;i++)
            System.out.println(a[i]);
    }
}
