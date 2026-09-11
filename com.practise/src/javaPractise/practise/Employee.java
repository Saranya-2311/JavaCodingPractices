package javaPractise.practise;

public class Employee {
    private String empName;
    private Integer empId;
    private Integer salary;
    public Employee(){

    }
    public Employee(String empName, Integer empId) {
        this.empName = empName;
        this.empId = empId;
        this.salary = 0;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(String empName, Integer empId, Integer salary) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }






}
