package DSpractice;


public class ReverseString {
    public static void main(String[] args){
        String str="Saranya";

        char[] reverseStr = reverseString(str);
        System.out.print("Reversed String = ");
        for(int i=0;i<reverseStr.length;i++){
            System.out.print( reverseStr[i]);
        }

    }
    public static char[] reverseString(String str){
        char[] charArr =str.toCharArray();

        int left=0;int right=charArr.length-1;

        while (left < right){
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return charArr;
    }
}
