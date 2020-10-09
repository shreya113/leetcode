import java.util.*;
public class pg7 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of noth the arrays");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[m];
        int i;
        System.out.println("enter the values of array A:");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the values of B:");
        for(i=0;i<m;i++)
            brr[i]=sc.nextInt();
        int c[]=new int[m+n];
        int j=0;
        for(i=0;i<m+n;i++)
        {
            if(i<n)
                c[i]=arr[i];
            else
            {
                c[i]=brr[j];
                j++;
            }
        }
            
        for(i=0;i<m+n;i++)
           System.out.println(c[i]);
    }
}
