import java.util.Scanner;

public class Q1_Sol {
    public static void main(String[] args) {
        //Q1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        System.out.println("Enter 3 Numbers");
        Scanner scanner = new Scanner(System.in);
        int a, b, c, max, min;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        max = largest(a, b, c);
        min = lowest(a, b, c);

        System.out.println("the largest number is " + max);
        System.out.println("the lowest number is " + min);
    }
    public static int largest(int a,int b,int c){
        int max = a;
        if (max<b){
            max=b;
        } if (max<c){
            max=c;
        }
        return max;
    }
    public static int lowest(int a,int b,int c){
        int min = a;
        if (min>b){
            min=b;
        } if (min>c){
            min=c;
        }
        return min;
    }

}
