import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        int temp = number;

        int lenght = String.valueOf(number).length();
        int sum = 0;
        while (number > 0){
            int remainder = number % 10;
            sum = sum + (int)Math.pow(remainder, lenght) ;
            number = number / 10;
        }

        if (temp == sum){
            System.out.println(temp + " is an armstrong number");
        } else {
            System.out.println(temp + " is not an armstrong number");
        }
    }
}
