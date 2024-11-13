import java.util.*;

//program to break an integer into a sequence of digits.

public class Ex_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 6 non negative digits");
        int digit = input.nextInt();

        int num1 = digit%10;
        int num = digit/10;
        int num2 = num%10;
        num  = num/10;
        int num3 = num%10;
         num  = num/10;
        int num4 = num%10;
        num  = num/10;
        int num5 = num%10;
        num  = num/10;
        int num6 = num%10;

        System.out.println(num6+" "+num5+" "+num4+" "+num3+" "+num2+" "+num1);



        
        
    }
    
}
