package novPractise.EmployeeSystem;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDemo {
    public static void main(String[] args){
        Employee e1 = new Employee(101, "John");
        Employee e2 = new Employee(101, "John");
        Employee e3 = new Employee(101, "sgdghfgj");
        Employee e4 = new Employee(105, "sgdyhfgj");
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        System.out.println(employeeSet.size());
    }
}
