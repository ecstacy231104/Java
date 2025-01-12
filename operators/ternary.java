

package operators;


import java.util.*;

public class ternary {

  public static void main(String[] args)
  {
    
    System.out.println("enter the first side of the triangle");
    Scanner scanobj=new Scanner(System.in);
    int A=scanobj.nextInt();
    System.out.println("enter the second side of the triangle");
    int B=scanobj.nextInt();
    System.out.println("enter the second side of the triangle");
    int C=scanobj.nextInt();
    String result;
    result=(A+B>C||B+C>A||A+C>B)?"it is triangle":"not a triangle";
    System.out.println("here it is"+result);


    
  }
}