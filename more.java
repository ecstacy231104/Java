
import java.util.*;

public class more{
    public static void main(String[] args){
        System.out.println("enter the marks: ");
        Scanner scanobj=new Scanner(System.in);
        int marks;
        marks=scanobj.nextInt();
        if(marks>=90 && marks <=100)
        {
            System.out.println("Grade A");
        }
        else if(marks>=75 && marks<90)
        {
            System.out.println("Grade B");
        }


    }
}


    
