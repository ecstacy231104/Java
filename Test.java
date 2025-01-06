import java.util.*;
class Test{
    public static void main(String []args){
        


        //  Write a program to calculate BMI. Use double for weight 
        // and height inputs and round off the result to 2 decimal places.
        System.out.println("calculating BMI");
        Scanner scanobj=new Scanner(System.in);
        double height,weight;
       System.out.println("Enter value for height in meter: ");
        height=scanobj.nextDouble();
       System.out.println("Enter value for weight in kg: ");
        weight=scanobj.nextDouble();
        // create a variable with name bmi of type double
       double BMI=0;
    //    /,*,%  (left to right)
       BMI= weight/(height*height);
       System.out.println("answer is = "+String.format("%.2f",BMI));
       

    //  double x = 2.23312;
    // System.out.println(String.format("%.4f",x));

 
    }
        
    }

  

