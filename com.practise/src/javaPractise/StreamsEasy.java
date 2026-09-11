package javaPractise;

import java.nio.charset.CodingErrorAction;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamsEasy {
    public static void main(String[] args) {
//*****************************Print all elemnts*********************************************************************
        //
        List<Integer> list = Arrays.asList(1, 4, 5, 6, 6);
        list.stream().forEach(System.out::println);
//*****************************convert a list to upper case************************************************************
        // converting to list and printing
        List<Character> charList = Arrays.asList('a', 'b', 'b', 'r');
        List<Character> resultArray = charList.stream().map(Character::toUpperCase).toList();
        for (Character c : resultArray)
            System.out.println(c);
        // directly printing
        List<Character> charList1 = Arrays.asList('a', 'b', 'b', 'r');
        charList1.stream().map(Character::toUpperCase).forEach(System.out::println);

//*********************************only even numbers*******************************************************************

        Stream.of(1, 5, 4, 6, 8, 3, 10).filter(n -> n % 2 == 0).forEach(System.out::println);
//**********************************only odd numbers******************************************************************

        Stream.of(1, 5, 4, 6, 8, 3, 10).filter(n -> n % 2 != 0).forEach(System.out::println);

//*******************************count of all elements in stream******************************************************
        System.out.println(Stream.of(1, 5, 6, 8, 4, 6, 8, 3, 10).count());

//********************************Sum of list of integers *****************************************************
        Integer sum = Stream.of(1, 5, 4, 6, 8, 3, 10).reduce(0, Integer::sum);
        System.out.println(sum);
        List<Integer> list3 = Arrays.asList();
        Optional<Integer> totalSum = Stream.of(1, 1, 2, 2).reduce((a, b) -> a - b);
        Optional<Integer> totalSum1 = list3.stream().reduce((a, b) -> a + b);
        System.out.println("Sum =" + totalSum1);// This prints Optional.empty
// ********************************String concatenation *****************************************************

        String result = Stream.of("Java", "Python", "C++")
                .reduce("hello", (partialString, element) -> partialString + element);// Collectors.joining("|") is better as it uses stringbuilder
        System.out.println("result " + result);

        String concatString = Stream.of(1, 4, 5)
                .map(String::valueOf)
                .collect(Collectors.joining("+"));
        System.out.println(concatString);

        //*****************************************any element is greater than 10***********************
        boolean result4 = Stream.of(1, 4, 5, 6, 18, 20)
                .peek(System.out::println)
                .anyMatch(n -> n > 10);
        System.out.println(result4);

        //********************************check if all element is positive
        boolean b = Stream.of(1, 2, 3, 4, 5).allMatch(n -> n > 0);
        System.out.println("all match " + b);

        // *********************no elemt is null***********
        List<List<Integer>> list5 = List.of(List.of(3, 4, 6), List.of(4, 5), new ArrayList<>());
        boolean result5 = list5.stream().noneMatch(Objects::isNull);
        System.out.println("result 5= " + result5);

//************************

        Optional<String> length = Stream.of("java", "Python", "developer123", "Springboot")
                .max(Comparator.comparing(String::length));
        System.out.println(length.get());

        List<String> resultString = Stream.of("java", "Python", "developer", "Springboot")
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(2).toList();
        for (String s : resultString)
            System.out.println(s);

        Optional<String> result8 = Stream.of("123", "12345", "123456", "12345678").sorted(Comparator.comparing(String::length)).findFirst();
        System.out.println(result8.get());

        Optional<Integer> value = Stream.of(1, 3, 4, 5).min(Comparator.comparing(Integer::valueOf));
        System.out.println(value.get());

        Optional<Integer> value2 = Stream.of(1, 3, 4, 5).max(Comparator.comparing(Integer::valueOf));
        System.out.println(value2.orElse(0));
        System.out.println("list");
        List<Integer> value3 = Stream.of(3, 3, 4, 4, 4, 5, 5, 1).distinct().sorted().toList();
        for (Integer i : value3)
            System.out.println(i);

        Optional<Integer> value4 = Stream.of(3, 3, 4, 4, 4, 5, 5, 1).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(value4);


        List<String> resultString6 = Stream.of("Java", "Python", "Developer", "Springboot").sorted(Comparator.naturalOrder()).toList();
        for (String stringVal : resultString6)
            System.out.println(stringVal);

        List<Integer> result7 = Stream.of(3, 7, 5, 5, 6, 7).limit(3).sorted(Comparator.reverseOrder()).toList();
        for (Integer k : result7) {
            System.out.println(k);
        }

    }
}
