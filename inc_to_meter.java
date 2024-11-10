import java.util.*;
//inc_to_meter
public class inc_to_meter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Num in Inch");
        double inc = scan.nextDouble();

        double met=(inc*0.0245);

        System.out.println(inc+" equals to "+met);

    }
    
}