import java.util.Scanner;
public class Q6_Solution {
    public static void main(String[] args) {
        //Q6. Input currency in rupees and output in USD.
        System.out.println("Please enter the amount in rupees");
        Scanner a = new Scanner(System.in);
        int amt = a.nextInt();
        float conv = (float) (amt*0.013);
        System.out.println("The USD conversion of "+amt+" rupees to USD is "+conv);
    }
}
