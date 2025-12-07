import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.println("Enter the end number: ");
        int end = scanner.nextInt();

        for (int i = start; i < end; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1){
                System.out.println(i);
            }
        }
    }
}
