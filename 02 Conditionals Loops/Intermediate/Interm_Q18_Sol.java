import java.util.Scanner;

public class Interm_Q18_Sol {
    public static void main(String[] args) {
        //Q18. Find if a number is palindrome or not
        System.out.println("Enter a Number");
        Scanner a = new Scanner(System.in);
        String ip = a.next();
        String rev="";
        for(int i=ip.length()-1;i>=0;i--){
            rev = rev+ip.charAt(i);
        }
        if (ip.equals(rev)){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }
    }
}
