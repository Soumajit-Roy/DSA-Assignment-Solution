import java.util.Scanner;

public class Q2_Sol {
    public static void main(String[] args) {
        //Q2. Define a program to find out whether a given number is even or odd.
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        checker(a);
    }
    private static void checker(int a){
        if (a%2==0){
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
    }
}
