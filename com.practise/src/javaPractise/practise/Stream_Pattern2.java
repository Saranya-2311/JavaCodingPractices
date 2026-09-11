package javaPractise.practise;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream_Pattern2 {

    public static void main(String[] args){

        //find first string with length > 5
        List<String> result6 = Stream.of("Saranya","Sai","Yuva","Senthil")
                .filter(s-> s.length() > 5).toList();
        System.out.println("Problem 6 ");
        for(String s : result6){
            System.out.println(s);
        }
        // find any number divisible by 7
        Optional<Integer> result7 = Stream.of(21,5,6,7,21,14).filter(n -> n%7==0).findAny();
        System.out.println("Problem 7 ");
        System.out.println(result7.isPresent()? result7.get(): "No number divisible by 7");

        //check if all the elements are positive
        Boolean result8 = Stream.of(21,5,6,7,21,14).allMatch(n-> n >-1);
        System.out.println("Problem 8 : "+ result8);

        //check if any element in a list is "java"
        Boolean result9 = Stream.of("","Java","saranya").anyMatch(s->s.equalsIgnoreCase("Java"));
        System.out.println("Problem 9 "+ result9);
        // check if no element is empty

        Boolean result10 = Stream.of("", "gjk").noneMatch(String::isEmpty);
        System.out.println("Problem 10 "+ result10);
    }
}
