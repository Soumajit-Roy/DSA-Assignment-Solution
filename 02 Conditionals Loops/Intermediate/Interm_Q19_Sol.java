import java.util.Scanner;

public class Interm_Q19_Sol {
    public static void main(String[] args) {
        //Q19. Future Investment Value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double p=sc.nextInt();
        System.out.print("Enter the interest rate: ");
        double r=sc.nextInt();
        System.out.print("Enter the time period in years: ");
        double y=sc.nextInt();
        double f=p*Math.pow((1+r/100),y);
        System.out.print("value is: "+f);
    }
}
