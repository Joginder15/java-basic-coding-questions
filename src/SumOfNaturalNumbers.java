public class SumOfNaturalNumbers {

    private static int sumOfFirstNNumbers(int n){
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(sumOfFirstNNumbers(10));
    }
}
