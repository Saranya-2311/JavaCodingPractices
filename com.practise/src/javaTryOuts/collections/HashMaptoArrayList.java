package javaTryOuts.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMaptoArrayList{

public static void main(String[] args) {
    HashMap<String, Integer> m = new HashMap<>();
    m.put("Geek1", 100);
    m.put("Geek2", 200);
    m.put("Geek3", 300);

    // Convert HashMap key-value pairs into an ArrayList
    ArrayList<Map.Entry<String, Integer>> al = new ArrayList<>(m.entrySet());

    // Print the ArrayList containing key-value pairs
    System.out.println("Key-Value Pairs: " + al);
}
}
