package DSpractice;


import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePolishNotation {
    public static void main(String[] args){
        String[] tokens = {"2", "1", "+", "3", "*"};

        Deque<String> stack = new ArrayDeque<>();

        for(int i =0;i< tokens.length;i++){
            String s = tokens[i];
            int result = 0;
            if(s.equals("+")  || s.equals("-") || s.equals("*") || s.equals("/")){
                 int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                switch (s) {
                    case "+":
                        result = a+b;
                        break;
                    case "-":
                        result = a -b;
                        break;
                    case "*":
                        result = a*b;
                        break;
                    case "/":
                        result = a/b;
                        break;
                }
                stack.push(String.valueOf(result));
            } else{
                stack.push(s);
            }
        }
        System.out.println("Result :" + stack.pop());
    }
}
