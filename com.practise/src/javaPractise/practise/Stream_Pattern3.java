package javaPractise.practise;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Stream_Pattern3 {
    public static void main(String[] args){
        //find sum of all integers in the list
        Integer result11 = Stream.of(1,5,6,7,0).reduce(0,Integer::sum);
        System.out.println("Problem 11= "+ result11);
        //find average salary of all employees
        OptionalDouble result12 = Stream.of(new Employee("Saranya",1,1000), new Employee("Yuva",2,8000)
                        ,new Employee("Sai",3,15000))
                .mapToDouble(Employee::getSalary).average();
        System.out.println("Problem 12= "+result12.getAsDouble());
        // find the max value in the list of doubles
        OptionalDouble result13 = Stream.of(0.0,5.6,7.9).mapToDouble(n->n).max();
        System.out.println("Problem 13 =  "+ result13.getAsDouble());
        //find min salary from the list of employee
        OptionalDouble result14 = Stream.of(new Employee("Saranya",1,0), new Employee("Yuva",2,0)
                        ,new Employee("Sai",3,0))
                .mapToDouble(Employee::getSalary).min();
        System.out.println("Problem 14 =  "+ result14.getAsDouble());
        //count the number of Strings that have more than 3 characters
        long result15 = Stream.of("Sai","Java","Yuva").filter(s-> s.length()> 3).count();
        System.out.println("problem 15= "+result15);
    }
}
