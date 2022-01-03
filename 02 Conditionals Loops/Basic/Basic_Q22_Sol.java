import java.util.Scanner;
public class Basic_Q22_Sol {
    public static void main(String[] args) {
        //Q22. Subtract the Product and Sum of Digits of an Integer.
        System.out.println("Enter a number(Must be a two or more digit number)");
        Scanner x= new Scanner(System.in);
        int temp,sum=0,multi = 1,sub,num = x.nextInt();
       while (num!=0){
            temp = num%10;
            sum = sum+temp;
            multi = multi*temp;
            num = num/10;
        }
       if (multi>sum){
           sub = multi-sum;
       } else sub = sum = multi;
       System.out.println("The Sum is "+sum+" The Product is "+multi);
       System.out.println("The Subtraction result is "+sub);
    }
}
