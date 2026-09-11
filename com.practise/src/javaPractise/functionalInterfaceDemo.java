package javaPractise;


import java.util.function.Predicate;

public class functionalInterfaceDemo {

    public static void main(String[] args){
        Person p1 = new Person();
        p1.setAge(34);
        p1.setName("fgdgfgh");
        Person p2 = new Person();
        p2.setName("hjk");
        p2.setAge(11);
        Predicate<Person> isAdult = p-> p.getAge()>12;
        boolean result = isAdult.test(p1);
        System.out.println("p1= "+result);
        result = isAdult.test(p2);
        System.out.println("p1= "+result);



    }
}
