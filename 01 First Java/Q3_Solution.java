import java.util.Scanner;
public class Q3_Solution {
    public static void main(String[] args) {
        //Q3. Write a program to input principal, time, and rate (P,T, R) from the user and find Simple Interest.
        System.out.println("Please enter the Principal Amount");
        Scanner a = new Scanner(System.in);
        int amt = a.nextInt();
        System.out.println("Please enter the Time");
        Scanner b = new Scanner(System.in);
        int time = b.nextInt();
        System.out.println("Please enter the Rate");
        Scanner c = new Scanner(System.in);
        float rate = c.nextFloat();
        float interest = (amt*time*rate)/100 ;
        System.out.println("Your simple interest is : "+ interest);
    }
}
