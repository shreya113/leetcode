import java.util.*;
public class freq_dis
{
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the arrays");
        int n=sc.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS");
        int arr[]=new int[n];
        int i;int p=0,j=0,count=0,x=0; 
        TreeSet<Integer> set=new TreeSet<Integer>();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
           
        }
       Arrays.sort(arr);
       j=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]==j)
                count++;
            else
            {
                System.out.println("The counting of : "+ arr[j-1]+" is : " +count);
                j=arr[i];
                count=1;
            }
        }
       
    }
}
