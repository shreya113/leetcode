import java.util.*;
public class Binary_search
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter the size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int i;
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the key to be searched");
    int k=sc.nextInt();
    boolean f=false;
    int l=0;
    int u=n-1;
    int mid=(int)((u+l)/2);
    while(l<=u)
    {
        if(arr[mid]==k)
        {
            f=true;
            break;
        }
        else if(arr[mid]>k)
        {
            u=mid-1;
          
        }
        else if(arr[mid]<k)
        {
            
              l=mid+1;
        }
        mid=(int)((u+l)/2);
    }
    
    if(f==true)
        System.out.println("THE KEY IS PRESENT AT " + (mid+1));
    else
        System.out.println("THE KEY IS NOT PRESEMT");
    }
}
