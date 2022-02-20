import java.util.Scanner;

public class Q9_Sol {
    //Q9. Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
    public static int factorial(int n){
        int fact=1;
        for (int i = 1;i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner x =new Scanner(System.in);
        int n = x.nextInt();
        System.out.println("The Factorial of "+n+" is "+factorial(n));
    }
}
