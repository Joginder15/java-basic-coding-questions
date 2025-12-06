import java.util.Scanner;

public class Palindrome {

    private static String checkForPalindrome(String string){
        String reversed = "";
        for (int i = 0; i < string.length(); i++){
            reversed = string.charAt(i) + reversed;
        }
        if (string.trim().equals(reversed.trim())) {
            return "Palindrome";
        } else {
            return "Not a Palindrome";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strInput = scanner.next();
        System.out.println(checkForPalindrome(strInput));

    }
}
