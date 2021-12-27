import java.util.Scanner;
public class Q5_Solution {
    public static void main(String[] args) {
        //Q5. Take 2 numbers as input and print the largest number.
        System.out.println("Please enter first number");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        System.out.println("Please enter second number");
        Scanner b = new Scanner(System.in);
        int num2 = b.nextInt();
        if (num1>num2){
            System.out.println(num1+" is the largest number");
        } else if (num2>num1) {
            System.out.println(num2+" is the largest number");
        } else {
            System.out.println("Both are equal");
        }
    }
}
