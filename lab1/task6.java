import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        boolean isPalindrome = true; 
        int wlength = word.length();
        int indx = 0;

        while (indx < wlength / 2) {
            if (word.charAt(indx) != word.charAt(wlength - 1 - indx)) {
                isPalindrome = false; 
                break;
            }
            indx++;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}