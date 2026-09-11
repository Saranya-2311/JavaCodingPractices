package DSpractice;

public class ValidPalindrome {
    public static void main(String[] args){
        String str ="AAK--KAA-";
        boolean result = isValidPalindrome(str);
        System.out.println("Result= "+result);

    }

    static boolean isValidPalindrome(String str){
        boolean isValidPalindrome = true;

        char[] charArr =  str.toCharArray();
        int left = 0;
        int right = charArr.length-1;
        while(left < right) {

          if(!Character.isLetterOrDigit(charArr[left])) {
               left++;
              continue;
        }
          if(!Character.isLetterOrDigit(charArr[right])){
              right--;
              continue;
          }
          if(Character.toLowerCase(charArr[left]) == Character.toLowerCase(charArr[right])){
              left++;
              right--;

          }else{
              isValidPalindrome = false;
              break;
          }
        }



        return isValidPalindrome;
    }
}
