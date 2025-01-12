import java.util.*;
public class Secondhighest
{
    public static void main(String[] args){
        System.out.println("enter the first number");
        Scanner scanobj=new Scanner(System.in);
        int A=scanobj.nextInt();
        System.out.println("enter the second number");
         int B=scanobj.nextInt();
         System.out.println("enter the third number");
         int C=scanobj.nextInt();
         System.out.println("enter the fourth number");
         int D=scanobj.nextInt();
         System.out.println("enter the fifth number");
         int E=scanobj.nextInt();
         int highest,secondhighest;
         if(A>B)
         {
            highest=A;
            secondhighest=B;
         }
         else{
             highest=B;
             secondhighest=A; 
         }
         if(C>highest)
         {
            int temp = highest;
            highest=C;
            secondhighest=temp;
         }
         if(D>highest){
            int temp = highest;
            highest = D;
           secondhighest = temp;
         }
         if(E)
()f
E>




    }
}