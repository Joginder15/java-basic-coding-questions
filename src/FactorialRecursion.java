import java.util.Scanner;

public class FactorialRecursion {

    private static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        System.out.println("Factorial is: " + factorial(input));
    }
}
