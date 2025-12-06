public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 7, 3, 11};

        int largest = arr[0];
        for (int number : arr){
            if (number > largest){
                largest = number;
            }
        }

        System.out.println("Largest number: "  + largest);
    }
}
