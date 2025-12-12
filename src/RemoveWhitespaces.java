public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "A u t o m a t i o n";

        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' '){
                newStr = newStr + str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
