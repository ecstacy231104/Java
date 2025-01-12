import java.util.*;
public class main{
    public static void main(String[] args)
    {
        int grosssalary;
        Scanner scanobj=new Scanner(System.in);
        System.out.println("enter the username");
        String username= scanobj.nextLine();
        System.out.println("enter the age");
        int age=scanobj.nextInt();
        System.out.println("enter the basic salary");
        int basicsalary = scanobj.nextInt();
        System.out.println("pfvalue");
        int pfvalue= scanobj.nextInt();
        System.out.println("Hra");
        int hra=scanobj.nextInt();
        System.out.println("da");
        int da= scanobj.nextInt();
        grosssalary=basicsalary+hra+da-pfvalue;
        System.out.println("gross salary is"+grosssalary);
        



        

    }
}