import java.util.Scanner;

public class ReverseString {

    private static String reverseTheString(String string){
        String reversed = "";
        for (int i = 0; i < string.length(); i++){
            reversed = string.charAt(i) + reversed;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strInput = scanner.next();
        System.out.println(reverseTheString(strInput));

    }
}
