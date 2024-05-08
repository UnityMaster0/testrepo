package classes;

public class Child extends Parent{

    public int id, salary;
    
    public Child(int id, int salary) {

        this.id = id;
        this.salary = salary;
    }

    @Override
    public String getEmployeeDetails() {
        return "ID: " + id + " Salary: " + salary;
    }
}