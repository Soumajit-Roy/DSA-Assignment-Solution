import java.util.Scanner;
public class Basic_Q21_Sol {
    public static void main(String[] args) {
        //Q21. Fibonacci Series In Java Programs.
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
