package DSpractice;

public class Palindrome {
    public static void main(String[] args){
        String str = "A man, a plan, ka canal: Panama";

        int left = 0;
        int right = str.length()-1;
        boolean isPalindrome = true;

      while(left<right){
          if(!Character.isLetterOrDigit(str.charAt(left))){
              left++;
          }else if (!Character.isLetterOrDigit(str.charAt(right))){
              right--;
          }else if(str.toLowerCase().charAt(left) == str.toLowerCase().charAt(right)){
              left++;
              right--;
          }else {
              isPalindrome = false;
              break;
          }
      }
      System.out.println("isPalindrome "+isPalindrome);
    }
}

