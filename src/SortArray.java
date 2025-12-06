public class SortArray {
    public static void main(String[] args) {
        int[] array = {5, 4, 1, 3, 6, 2, 7, 8, 12, 10};

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1; j++){
                int temp;
                if (array[j] > array[j+1]){
                    temp = array[j+1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
