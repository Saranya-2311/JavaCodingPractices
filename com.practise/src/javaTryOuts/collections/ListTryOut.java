package javaTryOuts.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListTryOut {

    public static void main(String[] args) {

        // Declaring an arrayList
        List<String> arrayLst = new ArrayList<>();
        arrayLst.add("Mango");
        arrayLst.add(0,"Orange");
        arrayLst.add("PineApple");

        for(String s : arrayLst){
            System.out.println(s);
        }
        System.out.println("Size:"+arrayLst.size());

        //Declaring Stack
        List<String> stackImpl1 = new Stack<>();
        stackImpl1.add("First");
        stackImpl1.add("Second");
        stackImpl1.add("Third");
        stackImpl1.add("Fourth");
        stackImpl1.add("fifth");
        // cannon use stackImpl.pop();

        //declare as stack
        Stack<String> stackImpl2 = new Stack<>();
        stackImpl2.push("First2");
        stackImpl2.push("Second2");
        stackImpl2.push("Third2");
        System.out.println("POP:"+stackImpl2.pop());
    }
}
