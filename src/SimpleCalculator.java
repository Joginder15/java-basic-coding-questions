import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.println("Enter operation(+,-,*,/): ");
        char operation = scanner.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println(first + second);
            break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            default:
                System.out.println("Wrong operation");
        }
    }
}
