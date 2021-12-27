import java.util.Scanner;
public class Q1_Solution {
    public static void main(String[] args) {
        //Q1. Write a program to print whether a number is even or odd, also take input.
        System.out.println("Please Enter a Number");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        if (num%2==0){
            System.out.println(num+" is an even number");
        }
        else{
            System.out.println(num+" is an odd number");
        }
    }
}
