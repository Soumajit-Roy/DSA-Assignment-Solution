import java.util.Scanner;
public class Interm_Q7_Sol {
    public static void main(String[] args) {
        //Q7. Power In Java
        System.out.println("Enter the base and exponent");
        Scanner x = new Scanner(System.in);
        int base = x.nextInt(), exponent = x.nextInt();
        long result = 1;
        for(;exponent!=0;exponent--){
            result *= base;
        }
        System.out.println("Result : "+result);
    }
}