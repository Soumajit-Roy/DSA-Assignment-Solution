import java.util.Scanner;

public class Q14_Sol {
    //Q14. Write a function that returns the sum of first n natural numbers.
    public static int nat(int n){
        int sum = (n * (n + 1)) / 2;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        nat(n);
    }
}
