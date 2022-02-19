import java.util.Scanner;
import java.lang.Math;

public class Q7_Sol {
    public static void main(String[] args) {
        //Q7. Define a method to find out if a number is prime or not.
        System.out.println("Enter a number");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        if (primechk(num))
            System.out.println(num+" is a Prime Number");
        else
            System.out.println(num+" is Not a prime number");
    }
    public static boolean primechk(int num){
        if (num<=1){
            return false;
        }else if (num%2==0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
