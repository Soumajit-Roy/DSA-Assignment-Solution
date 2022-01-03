import java.util.Scanner;
public class Basic_Q24_Sol {
    public static void main(String[] args) {
        //Q24. Take integer inputs till the user enters 0 and print the sum of all numbers
        //(HINT: while loop)
        System.out.println("Enter a number");
        int sum = 0,n=1;
        while (n != 0) {
            Scanner x = new Scanner(System.in);
            n = x.nextInt();
            sum = sum + n;
        }
        System.out.println("Sum of all numbers " + sum);
    }
}
