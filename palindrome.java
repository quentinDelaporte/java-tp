import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.next();
        System.out.println(estPalindrome(str));
    
    }

    public static boolean estPalindrome(String str) {
        if(str.equals(reverse(str))){
            return true;
        }
        return false;
    }

    public static String reverse(String str){
        String reverse = "";
        for (int i=str.length(); i>0; i--) {
            reverse = reverse + str.substring(i-1,i);
        }
        return reverse;
    }
}
