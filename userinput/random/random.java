package userinput.random;

import java.util.Scanner;

public class random {
    public static void main(String[] args)
    {
        int x,sum=0,modulus=0,div=0,product=0,sub=0;
        System.out.println("creating a calculator :");
        System.out.println("enter the value of x=");
       Scanner scanobj=new Scanner(System.in);
        x=scanobj.nextInt();
        System.out.println("the value of x is = "+x);
        int y;
        System.out.println("enter the value of y");
        y=scanobj.nextInt();
        System.out.println("the value of y is ="+y);
        sum=x+y;
        System.out.println("the value of sum is ="+sum);
        modulus=x%y;
        System.out.println("the value of modulus is ="+modulus);
        div=x/y;
        System.out.println("the value of division  is = "+div);
        product=x*y;
        System.out.println("the value of the product is = "+product);
        sub=x-y;
        System.out.println("the value of the subtract is = "+sub);
        



        




    }

    
}
