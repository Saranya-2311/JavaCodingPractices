package arrays.leetCodeTryOuts;
//Two Pointer
public class ReverseString {
    public static void main(String[] args) {
        String str = "abcabcdabc";
        String subString = reverseString(str);
        System.out.println("subString = " + subString);
    }

    private static String reverseString(String str) {
        char temp;
        char[] charArray = str.toCharArray();
        int i=0; int j=charArray.length-1;
        while(i<j){
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j]= temp;
            i++;
            j--;
        } 
        return String.valueOf(charArray);
    }
}
