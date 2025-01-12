package loop;
import java.util.*;
public class Prime{
    public static void main(String[] args)
    {
        int count=0,i;
        System.out.println("enter the number");
        Scanner scanobj=new Scanner(System.in);
        int n=scanobj.nextInt();
        // logic: 25
        // 1,25
        // 2,3,4,5,6,7,8,9,10,11,12,13,14,14,15,16,17,18,19,20,21,22,23,24
//           2 ...16
        // for(i=2;i<n;i++)//method 1 O(n) ex: 343, the loop will run for 341 time
        for(i=2;i<=(int)(Math.sqrt(n));i++)// this method  2 O(root n) // the loop will run for root of 343, i.e, 18
        {
            if(n%i==0)
            {
                count++;
                break;
                
            }
        }
        if(count>=1)
        {
            System.out.println("it is not prime");
        }
        else
        {
            System.out.println("it is prime");
        }
    }
}