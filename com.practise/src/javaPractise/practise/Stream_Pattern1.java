package javaPractise.practise;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Pattern1 {
    public static void main(String[] args){
        // filter even numbers and multiply by 2.
       List<Integer> result1 =  Stream.of(2,3,4,5,6,6,8,8,9,0,1)
                                        .filter(n->n%2==0).map(n->n*2).toList();
        System.out.println("Problem 1");
       for(Integer n : result1){
           System.out.println(n);
       }
       //filter the strings starting with A and convert to uppercase

        List<String> result2 = Stream.of("Apple", "Banana", "ant")
                                    .filter(n->(n.startsWith("A") || n.startsWith("a"))).map(String::toUpperCase).toList();
        System.out.println("Problem 2");
       for(String s : result2){
           System.out.println(s);
       }
    // find all numbers greater than 50
        List<Integer> result3 = Stream.of(10,90,80,40,30,50).filter(n->n>50).toList();
       System.out.println("problem 3");
       for(Integer k : result3){
           System.out.println(k);
       }
        // find list of employees, extract their name
            Set<String> resultSet4 = Stream.of(new Employee("Saranya",1), new Employee("Yuva",2),new Employee("Sai",3))
                    .map(Employee::getEmpName).collect(Collectors.toSet());
        System.out.println("problem 4");
        System.out.println(resultSet4);
        // filter out null values from a list of Strings
        List<String> result5 = Stream.of("Apple", "Banana", "ant", "", null).filter(Objects::nonNull).toList();
        System.out.println("problem 5");
        for(String str : result5) {
            System.out.println(str);
        }

    }
}
