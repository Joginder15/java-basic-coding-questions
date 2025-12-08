import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();



        for (int i = n; i > 0; i--){
            for (int j = 1; j < n - i; j++){
                System.out.print(" ");
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
