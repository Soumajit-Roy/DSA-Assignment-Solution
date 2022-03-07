import java.util.Scanner;
//Q10. Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Q10_Sol {
    public static String palindrome(String ip){
        String rev="";
        for(int i=ip.length()-1;i>=0;i--){
            rev = rev+ip.charAt(i);
        }
        if (ip.equals(rev)){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner a = new Scanner(System.in);
        String ip = a.next();
        palindrome(ip);
    }
}
