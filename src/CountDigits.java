import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int count = 0;

        while(num > 0){
            count++;
            num = num/10;
        }

        System.out.println("Count of digits of a given number is: " + count);
    }
}
