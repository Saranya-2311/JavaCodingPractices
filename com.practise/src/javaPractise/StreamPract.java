package javaPractise;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPract {
    public static void main(String[] args){
        List<String> stringList = Arrays.asList("This is java streams","prepare well","this is my program");
        List<String> uniqueWord = stringList.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).map(String::toLowerCase)
                .distinct()
                .sorted()
                .toList();


        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> evenList =  nestedNumbers.stream().flatMap(Collection::stream).filter(n-> n%2==0).toList();
  //      for(Integer e:evenList)
    //        System.out.println(e);

        List<String> rawData = Arrays.asList(
                "abc@gmail.com;xyz@yahoo.com",
                "pqr@outlook.com",
                "abc@gmail.com;lmn@gmail.com"
        );

        List<String> emails = rawData.stream().flatMap(email -> Arrays.stream(email.split(";"))).distinct().toList();
       // for(String e:emails)
//            System.out.println(e);


        List<String> rawTasks = Arrays.asList(
                "Coding,Testing",
                "  ",            // Should be ignored
                "Meeting",
                "",               // Should be ignored
                "Email,Lunch"
        );
        List<String> taskResult = rawTasks.stream().flatMap(s->Arrays.stream(s.split(",")))
                .map(String::trim).filter(s->!s.isBlank()).toList();
       // for(String e:taskResult)
         //   System.out.println(e);
        List<String> rawNum = Arrays.asList("1, 2, 3", "4, , 5", "6");
        List<Integer> numbers = rawNum.stream().flatMap(s->Arrays.stream(s.split(","))).map(String::trim)
                .filter(s-> !s.isBlank()).map(Integer::parseInt).toList();
       // for(Integer e:numbers)
         //   System.out.println(e);

        List<Integer> numberList = Arrays.asList(1,5,6,7,8,8,2);
        Map<Boolean, List<Integer>> map = numberList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
      //  System.out.println(map);

        List<String> stringList1 = Arrays.asList("Saranya","Yuvanethran","Sai","ant");
        Map<Integer,List<String>> resultMap = stringList1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(resultMap);

        List<String> stringList2 = Arrays.asList("Saranya","Yuvanethran","Sai","Sai");
        Map<String, Long> frequencyMap = stringList2.stream().collect(Collectors.groupingBy(s->s ,Collectors.counting()));
        System.out.println(frequencyMap);

    }
}
