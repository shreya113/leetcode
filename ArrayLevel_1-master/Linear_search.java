import java.util.*;

public class Linear_search
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
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
    for(i=0;i<n;i++)
    {
        if(arr[i]==k)
        {
            f=true;
            break;
        }
    }
    if(f==true)
    System.out.println("The found at positon : " + (i+1));
    else
        System.out.println("Not found");
 }
}
