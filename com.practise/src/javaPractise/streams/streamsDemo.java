package javaPractise.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class streamsDemo implements Cloneable{
    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1,2,2,1,3,3);

        List<Integer> result = numbers.stream().map(n->n*10).sorted().toList();
        Map<Integer,Long> freqMap = numbers.stream().collect(Collectors.groupingBy(n-> n, Collectors.counting()));
        for(Integer m : result ){
            System.out.println(m);
        }
        freqMap.forEach((key,value)-> System.out.println(key + " ,"+value ));
    }

    @Override
    public streamsDemo clone() {
        try {
            return (streamsDemo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
