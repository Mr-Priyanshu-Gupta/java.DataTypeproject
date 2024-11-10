import java.util.*;
public class EX_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an in teger between 0 to 1000");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remaningDigit = num/10;
        int secondDigit = remaningDigit % 10;
            remaningDigit = remaningDigit / 10;
        int thirdDigit = remaningDigit % 10;
            remaningDigit = remaningDigit / 10;
        int forthDigit = remaningDigit % 10;
        int sum = firstDigit+secondDigit+thirdDigit+forthDigit ;
        System.out.println("The sum of all digits in " + num + " is " + sum);



    }
    
}
