import java.util.Scanner;

public class Q4_Sol {
    public static void main(String[] args) {
        //Q4. Write a program to print the sum of two numbers entered by user by defining your own method.
        System.out.println("Enter two numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result=add(a,b);
        System.out.println("The result is : "+result);
    }
    private static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }
}
