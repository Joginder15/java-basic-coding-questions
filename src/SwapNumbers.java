import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("After swapping first number: " + firstNumber + " and second number: " + secondNumber);
    }
}
