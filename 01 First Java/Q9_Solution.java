import java.util.Scanner;
public class Q9_Solution {
    public static void main(String[] args) {
        //Q9. To find Armstrong Number between two given number.
        System.out.println("Enter a Number");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int temp, total=0, digits=0;
        int numt = num;
        while (numt>0){
            numt = numt/10;
            digits++;;
        }
        numt = num;
        while (numt!=0){
            temp = numt%10;
            total += Math.pow(temp,digits);
            numt=numt/10;
        }
        if (total==num){
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("it is not an armstrong number");
        }
    }
}
