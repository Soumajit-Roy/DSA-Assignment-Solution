import java.util.Scanner;
public class Basic_Q23_Sol {
    public static void main(String[] args) {
        //Q23. Input a number and print all the factors of that number (use loops).
        System.out.println("Enter a number");
        Scanner x= new Scanner(System.in);
        int n = x.nextInt();
        for (int i=1;i<=n;i++){
            if (n % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
