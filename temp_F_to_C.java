// temp_F-to-C 
import java.util.*;
public class temp_F_to_C{
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("Input Fahrenheit:");
        double fahr = scanf.nextDouble();

        double cel = ((5.0*(fahr-32.0))/9.0);
        System.out.println(fahr + " degree Fahrenheit is equal to " + cel + " in celsius");
    }

    
}