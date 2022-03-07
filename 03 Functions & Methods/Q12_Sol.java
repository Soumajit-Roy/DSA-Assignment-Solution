import java.util.Scanner;

public class Q12_Sol {
    public static boolean istripletchk(int a,int b,int c){
        if (a*a==(b*b)+(c*c)){
            System.out.println("it is a Pythagorean triplet");
            return true;
        } else if (b*b==(a*a)+(c*c)){
            System.out.println("it is a Pythagorean triplet");
            return true;
        } else if (c*c==(b*b)+(a*a)){
            System.out.println("it is a Pythagorean triplet");
            return true;
        } else {
            System.out.println("it is not a Pythagorean triplet");
        }
        return false;
    }
    public static void main(String[] args) {
        //Write a function to check if a given triplet is a Pythagorean triplet or not.
        //(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number)
        System.out.println("Enter 3 single digit numbers");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        istripletchk(a,b,c);
    }
}
