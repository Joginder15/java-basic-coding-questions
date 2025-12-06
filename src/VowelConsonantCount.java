import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.next();

        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : string.toCharArray()){
            if ("aieouAIEOU".indexOf(c) != -1){
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
    }
}
