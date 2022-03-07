import java.util.Scanner;

public class Q13_Sol {
    //Write a function that returns all prime numbers between two given numbers.
    public static boolean primechk(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        for (int i = a; i <= b; i++) {
            if (primechk(i))
                System.out.print(i+" ");

        }
    }
}
