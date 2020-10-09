import java.util.*;
import java.io.*;
public class non_repeating
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the arrays");
        int n=sc.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS");
        int arr[]=new int[n];
        int i;int k=0;
        for(i=0;i<n;i++)
        {
            k=sc.nextInt();
            arr[i]=k;
        }
        k=0;
        int j=0;int count=0;
        for(i=0;i<n;i++)
        {
            k=arr[i];
            for(j=0;j<n;j++)
            {
             if(k==arr[j])
                 count++;
            }
            if(count==1)
                System.out.println(k);
            
            count=0;
        } 
        
    }
}   
