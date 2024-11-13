import java.util.*;
//program to compute the body mass index (BMI).
public class EX_5 {
    public static void main(String[] args) {
        double weight,height;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Weight");
        weight = input.nextDouble();
        System.out.println("Enter Height");
        height = input.nextDouble();

        double bmi=(((weight*0.45359237)/(height*0.0254*height*0.0254)));

        System.out.println(bmi);

        
    }

    
}