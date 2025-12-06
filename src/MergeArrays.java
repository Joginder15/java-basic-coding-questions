public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] mergedArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < mergedArray.length; i++){
            if (i < arr1.length){
                mergedArray[i] = arr1[i];
            } else {
                mergedArray[i] = arr2[i-arr1.length];
            }
        }

        for (int i : mergedArray){
            System.out.print(i + " ");
        }
    }
}
