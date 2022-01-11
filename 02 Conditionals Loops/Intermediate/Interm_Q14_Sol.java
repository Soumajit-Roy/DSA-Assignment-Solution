import java.util.Scanner;

public class Interm_Q14_Sol {
    public static void main(String[] args) {
        //Q14. Sum Of N Numbers
        System.out.println("Enter number of elements");
        Scanner x = new Scanner(System.in);
        int sum = 0, n = x.nextInt();
        System.out.println("Enter the elements");
        for (int i=0;i<n; i++){
            int num = x.nextInt();
            sum = sum + num;
        }
        System.out.println("Sum = "+sum);
    }
}
