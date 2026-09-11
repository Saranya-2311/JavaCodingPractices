package javaPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args){

        //find the freq of items in list using streams
        List<Integer> list = Arrays.asList(4,5,5,6,7,7,7);
        Map<Integer,Long> freqMap = list.stream().
                collect(Collectors.groupingBy(n-> n,Collectors.counting()));
        for(Map.Entry<Integer,Long> entry : freqMap.entrySet()) {
            System.out.println(entry.getValue());
        }

            List<Integer> result = list.stream().map(n-> n*30).sorted().collect(Collectors.toList());
            for(Integer n : result){
                System.out.println("by 30 and sort: "+n);
            }

        List<Integer> set=list.stream().
                collect(Collectors.groupingBy(n-> n,Collectors.counting())).entrySet().stream()
                .filter(n-> n.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

            for(Integer n : set){
                System.out.println("Set "+n);
            }

            List<Integer> list6 = Stream.of(1,5,6,7,8,9,0,9).skip(3).toList();

            List<Integer> result7 = Stream.of("java","Yuva","yuvanethran","SAi","SaiNavilan").map(String::length).toList();
            for(Integer i : result7){
                System.out.println("Length : "+ i);
            }

            List<String> result8 = Stream.of("java","Yuva","yuvanethran","SAi","SaiNavilan")
                    .filter(n-> n.startsWith("S")).toList();
        for(String i : result8){
            System.out.println("Startswith : "+ i);
        }

        List<String> stringList1 = Arrays.asList("saran","example","ant","bat","nexus");
        Map<Integer,List<String>> result3 = stringList1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result3);
        result3.forEach((length, words) ->
                System.out.println("Length " + length + ": " + words));


        }

    }

