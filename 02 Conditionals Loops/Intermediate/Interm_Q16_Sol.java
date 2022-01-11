import java.util.Scanner;

public class Interm_Q16_Sol {
    public static void main(String[] args) {
        //Q16. Find Ncr & Npr
        System.out.println("Enter N and R");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), r=x.nextInt(), nf=1, nrf=1, rf=1;
        for (int i = n; i>0;i--){
            nf = nf*i;
        }
        for (int i = n-r; i>0;i--){
            nrf = rf*i;
        }
        for (int i = r; i>0;i--){
            rf=rf*i;
        }
        int npr = nf/nrf;
        int ncr = nf/(rf*nrf);
        System.out.println("NPR = "+npr+" NCR = "+ncr);
    }
}
