import java.util.Scanner;

public class Q5_Sol {
    public static void main(String[] args) {
        //Q5. Define a method that returns the product of two numbers entered by user.
        System.out.println("Enter two numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result=multi(a,b);
        System.out.println("The result is : "+result);
    }
    private static int multi(int a, int b) {
        int prod = a*b;
        return prod;
    }
}
