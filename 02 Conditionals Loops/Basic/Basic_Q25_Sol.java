import java.util.Scanner;
public class Basic_Q25_Sol {
    public static void main(String[] args) {
        //Q25. Take integer inputs till the user enters 0 and print the largest number from all.
        System.out.println("Enter a number");
        int n = 1,lar = 0;
        while (n != 0) {
            Scanner x = new Scanner(System.in);
            n = x.nextInt();
            int temp = n;
            if (n > lar) {
                lar = temp;
            }
        }
        System.out.println("Largest Number is " + lar);
    }
}
