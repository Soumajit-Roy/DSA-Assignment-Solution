import java.util.Scanner;
public class Interm_Q6_Sol {
    public static void main(String[] args) {
        //Q6. Calculate Commission Percentage
        System.out.println("Enter the Sale Price");
        Scanner x = new Scanner(System.in);
        float price = x.nextFloat();
        System.out.println("Enter the commission amount");
        float camt = x.nextFloat();
        float cper = (camt*100f)/price;
        System.out.println("Here is the commission percentage : "+cper);
    }
}