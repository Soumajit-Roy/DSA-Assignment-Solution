import java.util.Scanner;
public class Q2_Solution {
    public static void main(String[] args) {
        //Q2. Take name as input and print a greeting message for that name.
        System.out.println("Please Enter Your Name");
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();
        System.out.println("Hello "+name+ ". Nice to Meet You.");
    }
}
