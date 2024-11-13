import java.util.*;
//EX_4:- Java program to convert minutes into years and days.

public class EX_4 {

    public static void main(String[] args) {
        double min , days , years ; 
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter minutes ");
        min = input.nextInt();
        days=(((min/60)/24)%365);
        years=(((min/60)/24)/365);
        System.out.println(min+" minutes is approximately "+years +" years and "+days);
    }
}