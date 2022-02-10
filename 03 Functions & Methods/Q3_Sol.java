import java.util.Scanner;

public class Q3_Sol {
    public static void main(String[] args) {
        //Q3.A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        System.out.println("Enter your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        eli(age);
    }
    public static void eli(int age) {
        if (age>=18){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
