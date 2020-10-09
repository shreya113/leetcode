import java.util.*;

public class pg6
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Map<Integer,Integer> mp=new HashMap<>();
    mp.put(1,31);
    mp.put(2,28);
    mp.put(3,31);
    mp.put(4,30);
    mp.put(5,31);
    mp.put(6,30);
    mp.put(7,31);
    mp.put(8,30);
    mp.put(9,31);
    mp.put(10,31);
    mp.put(11,30);
    mp.put(12,31);
    System.out.println("The number of days in :" + n +" is :"+mp.get(n));

    
}
}
