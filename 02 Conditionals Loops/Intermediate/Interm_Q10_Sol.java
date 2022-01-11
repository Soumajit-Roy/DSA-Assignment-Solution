import java.util.Scanner;

public class Interm_Q10_Sol {
    public static void main(String[] args) {
        //Q10. Calculate CGPA Java Program
        System.out.println("Enter how many subjects are there");
        Scanner x =new Scanner(System.in);
        int sub = x.nextInt();
        float total=0;
        for (int i=1;i<=sub;i++){
            System.out.println("Enter the Subject "+i+" Grade");
            float subgrade = x.nextFloat();
            total = total +subgrade;
        }
        float cgpa = total/sub;
        System.out.println("CGPA is : "+ cgpa);
    }
}
