public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        int missingNumber = 0;
        for (int i = 1; i <= arr.length; i++){
            if (arr[i - 1] != i){
                missingNumber = i;
                break;
            }
        }
        System.out.println("Missing number is " + missingNumber);
    }
}
