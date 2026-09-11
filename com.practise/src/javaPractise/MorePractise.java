package javaPractise;

import java.util.function.Function;

public class MorePractise {
    public static void main(String[] args){
        Function<String, Integer> parser = (s) -> Integer.parseInt(s);
        Function<String,Integer> parser2 = Integer::parseInt;
    }
}
