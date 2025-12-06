import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};

        HashSet<Integer> newArray = new HashSet<>();
        for (int number : arr){
            newArray.add(number);
        }

        System.out.println(newArray);
    }
}
