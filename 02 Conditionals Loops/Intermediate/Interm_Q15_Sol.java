import java.util.Scanner;

public class Interm_Q15_Sol {
    public static void main(String[] args) {
        //Q15. Armstrong Number In Java
        System.out.println("Enter a number");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt(); //153
        int num1, temp, total = 0;
        num1 = num;
        while (num1 != 0) {
            temp = num1 % 10;
            total = total + (temp * temp * temp);
            num1 /= 10;
        }
        if (num == total) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}
