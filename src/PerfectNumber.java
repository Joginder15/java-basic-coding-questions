import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int input = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= input/2; i++){
            if (input % i == 0) {
                sum = sum + i;
            }
        }
        if (input == sum){
            System.out.println(input + " a perfect number.");
        } else {
            System.out.println(input + " is not a perfect number.");
        }
    }
}
