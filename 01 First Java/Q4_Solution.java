import  java.util.Scanner;
public class Q4_Solution {
    public static void main(String[] args) {
        //Q4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        System.out.println("Please enter first number");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        System.out.println("Please enter second number");
        Scanner b = new Scanner(System.in);
        int num2 = b.nextInt();
        System.out.println("Enter an operator(+, -, *, /)");
        Scanner c = new Scanner(System.in);
        String op = c.next();
        if (op.equals("+")){
            System.out.println("Your result is : "+(num1+num2) );
        } else if (op.equals("-")){
            System.out.println("Your result is : " + (num1 - num2));
        } else if (op.equals("*")){
            System.out.println("Your result is : " + (num1 * num2));
        } else if (op.equals("/")) {
            System.out.println("Your result is : " + ((float) num1 / num2));
        } else {
            System.out.println("Please enter a valid operator");
        }
    }
}
