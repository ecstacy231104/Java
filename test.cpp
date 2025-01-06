import java.uti.*
class test
{
    public static void main(String[] args)
    {
        System.out.println("caluclating BMI");
        Scanner scanobj=new Scanner(System.in);
        double weight,height;
        System.out.println("enter the height in meters");
        height=scanobj.nextDouble();
        System.out.println("enter the weight in kgs");
        weight=scanobj.nextWeight();
        double BMI=0;
        BMI=weight/(height*height);
        System.out.println("answer is = "+String.format("%.2f",BMI));



    }
}