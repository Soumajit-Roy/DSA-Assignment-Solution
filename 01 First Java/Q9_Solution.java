import java.util.Scanner;
public class Q9_Solution {
    public static void main(String[] args) {
        //Q9. To find Armstrong Number between two given number.
        System.out.println("Enter a number");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt(); //153
        int num1,temp,total=0;
        num1=num;
        while ( num1!=0){
            temp= num1%10;
            total= total+ (temp*temp*temp);
            num1 /= 10;
        }
        if (num==total){
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}
