import java.util.Scanner;

public class PrimeCheck {

    private static boolean isPrime(int number){
        boolean isPrime = true;

        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();

        System.out.println("The given number is prime: " + isPrime(number));
    }
}
