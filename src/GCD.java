public class GCD {

    private static int getGCD(int a, int b){
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 48, b = 18;

        System.out.println("GCD of given numberrs are: " + getGCD(a, b));
    }
}
