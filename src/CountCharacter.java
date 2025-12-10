import java.util.Scanner;

public class CountCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.next();

        System.out.println("Enter a character to find count");
        char c = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (c == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Provide char count is: " + count);
    }
}
