import java.util.Scanner;
public class Q7_Solution {
    public static void main(String[] args) {
        //Q7. To calculate Fibonacci Series up to n numbers.
        System.out.println("Enter a number");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for (int i=2;i<num;i++){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
