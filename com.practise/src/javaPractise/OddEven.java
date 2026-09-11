package javaPractise;

public class OddEven {
    public static void main (String[] args){
        boolean isEven;
        Number num = new Number();
        isEven = num.isOddOrEven(7);
        if(isEven){
            System.out.println("number is even");
        } else{
            System.out.println("number is odd");
        }

    }
}
class Number{

    boolean isOddOrEven(int number){
        return number % 2 == 0;
    }
}
