import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number for fibonacci series: ");
        int number = scanner.nextInt();


        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);

        while (number - 2 > 0){
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            number--;
        }
    }
}
