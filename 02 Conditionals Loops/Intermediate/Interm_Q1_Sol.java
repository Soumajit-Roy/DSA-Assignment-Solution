import java.util.Scanner;
public class Interm_Q1_Sol {
    public static void main(String[] args) {
        //Q.1 Factorial Program
        System.out.println("Enter a number");
        Scanner x = new Scanner(System.in);
        int i,f=1;
        for (i= x.nextInt();i>=1;i--){
            f=f*i;
        }
        System.out.println("The factorial is "+f);
    }
}
