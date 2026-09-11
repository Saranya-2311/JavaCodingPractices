package javaPractise;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamPrac {

    public static void main(String[] args){
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);


        System.out.println(Runtime.getRuntime().availableProcessors());
       /** listOfNumbers.stream()
                .peek(n -> System.out.println("STAGE 1 (" + Thread.currentThread().getName() + "): " + n))
                .sequential()
                .peek(n -> System.out.println("STAGE 2 (" + Thread.currentThread().getName() + "): " + n))
                .parallel().count()  // this wins — whole pipeline becomes sequential
                .forEach(n -> System.out.println("STAGE 3 (" + Thread.currentThread().getName() + "): " + n));
*/
    }
}
