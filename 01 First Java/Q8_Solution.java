import java.util.Scanner;
public class Q8_Solution {
    public static void main(String[] args) {
        //Q8. To find out whether the given String is Palindrome or not.
        System.out.println("Enter a string");
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
