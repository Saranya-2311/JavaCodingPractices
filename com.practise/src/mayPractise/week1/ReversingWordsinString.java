package mayPractise.week1;

public class ReversingWordsinString {
    public static void main(String[] args) {
        String str = "Hello World ";
        String reverseStr = reverseWordsApproachOne(str);
        System.out.println("reversed String:: " + reverseStr);
    }

    public static String reverseWordsApproachOne(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder reverseString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverseString = reverseString.append(words[i]).append(" ");
        }
        return reverseString.toString();
    }
}
