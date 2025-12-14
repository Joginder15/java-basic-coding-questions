import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> charSet = new HashMap<>();

        for (char character : str.toCharArray()){
            charSet.put(character, charSet.getOrDefault(character, 0) + 1);
        }

        char maxChar = str.charAt(0);

        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charSet.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println(maxChar + " " + maxCount);

        System.out.println(charSet);

    }
}
